#!/usr/bin/env python3
"""解析图片内容 —— 提取文字、描述图片基本信息。

依赖安装（选一种即可）:
  pip install pillow                    # 仅基本信息，无需 OCR
  pip install easyocr                   # 推荐：纯 Python，中文识别好，首次运行会下载模型
  pip install pytesseract pillow        # 需额外安装 Tesseract OCR 系统包
"""

import argparse
import sys
from pathlib import Path


def check_deps():
    """检查可用的图片解析方式"""
    methods = []

    try:
        from PIL import Image
        methods.append("pillow")
    except ImportError:
        pass

    try:
        import pytesseract
        methods.append("tesseract")
    except ImportError:
        pass

    try:
        import easyocr
        methods.append("easyocr")
    except ImportError:
        pass

    return methods


def parse_pillow(path):
    """Pillow 读取图片基本信息"""
    from PIL import Image

    img = Image.open(path)
    return {
        "format": img.format,
        "size": f"{img.size[0]} x {img.size[1]}",
        "mode": img.mode,
        "dpi": img.info.get("dpi", "未知"),
    }


def parse_tesseract(path, lang="chi_sim+eng"):
    """Tesseract OCR 识别文字"""
    import pytesseract
    from PIL import Image

    img = Image.open(path)
    text = pytesseract.image_to_string(img, lang=lang)
    return text.strip()


def parse_easyocr(path, langs=None):
    """EasyOCR 识别文字（中文+英文），通过 Pillow 读取避免 OpenCV 中文路径问题"""
    import easyocr
    import numpy as np
    from PIL import Image

    if langs is None:
        langs = ["ch_sim", "en"]

    img = Image.open(path)
    img_array = np.array(img)

    reader = easyocr.Reader(langs, gpu=False)
    results = reader.readtext(img_array, detail=0)
    return "\n".join(results) if results else ""


def main():
    parser = argparse.ArgumentParser(description="解析图片内容，提取文字和信息")
    parser.add_argument("file", help="图片文件路径")
    parser.add_argument(
        "-m", "--method", choices=["auto", "pillow", "tesseract", "easyocr"],
        default="auto", help="解析方式 (默认 auto)"
    )
    parser.add_argument("--info-only", action="store_true", help="仅显示图片基本信息")
    parser.add_argument(
        "--tesseract-lang", default="chi_sim+eng",
        help="Tesseract 语言包 (默认 chi_sim+eng)"
    )
    parser.add_argument(
        "--easyocr-lang", nargs="+", default=["ch_sim", "en"],
        help="EasyOCR 语言 (默认 ch_sim en)"
    )

    args = parser.parse_args()
    methods_available = check_deps()

    # 图片基本信息
    if "pillow" in methods_available:
        info = parse_pillow(args.file)
        print(f"格式: {info['format']}  |  尺寸: {info['size']}  |  模式: {info['mode']}")
    else:
        print("提示: 未安装 pillow，无法读取图片基本信息")

    if args.info_only:
        return

    # 自动选择 OCR 方式
    if args.method == "auto":
        if "easyocr" in methods_available:
            args.method = "easyocr"
        elif "tesseract" in methods_available:
            args.method = "tesseract"
        else:
            args.method = "pillow"

    print(f"\n解析方式: {args.method}\n{'=' * 60}")

    if args.method == "easyocr":
        try:
            text = parse_easyocr(args.file, args.easyocr_lang)
            print(text if text else "(未识别到文字)")
        except Exception as e:
            print(f"EasyOCR 失败: {e}")
            sys.exit(1)

    elif args.method == "tesseract":
        text = parse_tesseract(args.file, args.tesseract_lang)
        print(text if text else "(未识别到文字)")

    elif args.method == "pillow":
        print("当前仅支持读取基本信息，如需 OCR 请安装:")
        print("  推荐: pip install easyocr")
        print("  备选: pip install pytesseract pillow + 安装 Tesseract OCR 系统包")


if __name__ == "__main__":
    main()
