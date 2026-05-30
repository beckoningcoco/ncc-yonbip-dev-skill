"""
NCC Class Index Builder
用法: python build_index.py <NCHOME路径> <版本号>
示例: python build_index.py E:/NCProject/NCC2111/home 2111
"""
import json, os, sys, zipfile

def build_index(home_path, version):
    index = {}
    jar_count = 0
    class_count = 0

    for root, dirs, files in os.walk(home_path):
        # 跳过 JDK
        if "ufjdk" in root.replace("\\", "/").split("/"):
            continue

        for f in files:
            if not f.endswith(".jar"):
                continue

            jar_path = os.path.join(root, f)
            jar_rel = os.path.relpath(jar_path, home_path).replace("\\", "/")
            jar_count += 1

            try:
                with zipfile.ZipFile(jar_path, 'r') as zf:
                    for name in zf.namelist():
                        if name.endswith(".class") and not name.endswith("module-info.class"):
                            fqcn = name[:-6].replace("/", ".")
                            index[fqcn] = jar_rel
                            class_count += 1
            except Exception:
                pass

            if jar_count % 200 == 0:
                print(f"  已扫描 {jar_count} 个 jar, {class_count} 个类...")

    # 保存索引（相对路径）
    script_dir = os.path.dirname(os.path.abspath(__file__))
    output = os.path.join(script_dir, "..", f"class_index_{version}.json")
    result = {
        "version": version,
        "total_jars": jar_count,
        "total_classes": class_count,
        "index": index
    }
    with open(output, 'w', encoding='utf-8') as out:
        json.dump(result, out, ensure_ascii=False, separators=(',', ':'))

    print(f"\n完成！{jar_count} 个 jar, {class_count} 个类")
    print(f"索引文件: {output}")

    # 更新 ncc_home_path.json
    config_path = os.path.join(script_dir, "..", "ncc_home_path.json")
    cfg = {"default_version": version, "versions": {}}
    if os.path.exists(config_path):
        with open(config_path, 'r', encoding='utf-8') as f:
            cfg = json.load(f)

    cfg["versions"][version] = {
        "path": home_path,
        "description": f"NCC {version}",
        "index_file": f"class_index_{version}.json",
        "jdk_version": "?",
        "indexed": True
    }
    if "default_version" not in cfg or not cfg["default_version"]:
        cfg["default_version"] = version

    with open(config_path, 'w', encoding='utf-8') as f:
        json.dump(cfg, f, ensure_ascii=False, indent=2)

    print(f"配置已更新: {config_path}")

if __name__ == "__main__":
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    build_index(sys.argv[1], sys.argv[2])
