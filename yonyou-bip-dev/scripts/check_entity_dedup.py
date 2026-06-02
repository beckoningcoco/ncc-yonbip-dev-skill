"""
YonBIP 知识库实体排重工具
扫描 wiki/entities/ 目录，提取所有已消化实体的 URI。
用于判断某个实体是否已存在于知识库，避免重复拉取/消化。

用法：
  python check_entity_dedup.py                     # 列出所有已消化实体
  python check_entity_dedup.py pc.unit.Unit        # 检查 pc.unit.Unit 是否已消化
  python check_entity_dedup.py --check pc.unit.Unit pc.product.Product  # 批量检查
"""
import os, glob, re, sys, argparse

WIKI_DIR = r"D:\yon-bip-obsidian\yon-bip-obsidian\wiki\entities"


def get_digested_uris(wiki_dir=WIKI_DIR):
    """扫描 wiki entities 目录，返回所有已消化实体的 URI 集合"""
    uris = {}
    for fpath in glob.glob(os.path.join(wiki_dir, "*.md")):
        with open(fpath, "r", encoding="utf-8") as f:
            content = f.read()
        # 从标题行提取 URI: # 显示名 (`uri.here`)
        m = re.search(r"# .+\((.+?)\)", content)
        if m:
            uri = m.group(1).strip().replace("`", "")
            fname = os.path.basename(fpath).replace(".md", "")
            uris[uri] = fname
    return uris


def main():
    parser = argparse.ArgumentParser(description="YonBIP 知识库实体排重工具")
    parser.add_argument("uri", nargs="*", help="要检查的实体 URI")
    parser.add_argument("--check", nargs="*", dest="check_list", help="批量检查多个 URI")
    parser.add_argument("--wiki-dir", default=WIKI_DIR, help="wiki entities 目录路径")
    args = parser.parse_args()

    uris = get_digested_uris(args.wiki_dir)
    candidates = args.uri + (args.check_list or [])

    if not candidates:
        # 无参数：列出所有已消化实体
        print(f"知识库已消化实体（{len(uris)} 个）：")
        for uri in sorted(uris):
            print(f"  [{uris[uri]}] → {uri}")
        return

    # 逐条检查
    new_count = 0
    exist_count = 0
    for c in candidates:
        if c in uris:
            print(f"  [已消化] {c} → [[{uris[c]}]]")
            exist_count += 1
        else:
            print(f"  [未拉取] {c}")
            new_count += 1

    print(f"\n结果: {exist_count} 个已存在, {new_count} 个需要拉取")


if __name__ == "__main__":
    main()
