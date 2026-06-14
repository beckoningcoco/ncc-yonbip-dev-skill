"""BIP 元数据消化工具"""
import json, os, glob, re, sys
from datetime import date
sys.stdout.reconfigure(encoding='utf-8')

JSON_DIR = r"D:\yon-bip-obsidian\yon-bip-obsidian\wiki\metadata-json"
ENTITIES_DIR = r"D:\yon-bip-obsidian\yon-bip-obsidian\wiki\entities"
today = date.today().strftime("%Y-%m-%d")

def get_type_name(type_val):
    if isinstance(type_val, dict): return type_val.get("name", "")
    if isinstance(type_val, str): return type_val
    return ""

def load_json(fp):
    with open(fp, 'r', encoding='utf-8') as f: return json.load(f)

def get_existing_uris():
    uris = set()
    for fp in glob.glob(os.path.join(ENTITIES_DIR, "*.md")):
        with open(fp, 'r', encoding='utf-8') as f:
            m = re.search(r"# .+\((.+?)\)", f.read())
            if m: uris.add(m.group(1).strip().replace("`", ""))
    return uris

def extract_summary(data):
    inner = data.get("data", {}).get("data", {})
    ka = inner.get("keyAttribute", {}) or {}
    ca = inner.get("codeAttribute", {}) or {}
    return {
        "uri": inner.get("uri", ""), "displayName": inner.get("displayName", ""),
        "tableName": inner.get("tableName", ""), "domain": inner.get("domain", ""),
        "app": inner.get("applicationCode", ""), "metaType": inner.get("metaType", ""),
        "buildTime": inner.get("buildTime", ""),
        "pkField": ka.get("fieldName", "id"), "pkDisplay": ka.get("displayName", ""),
        "pkType": get_type_name(ka.get("type", "")),
        "codeField": ca.get("fieldName", ""), "codeDisplay": ca.get("displayName", ""),
        "codeType": get_type_name(ca.get("type", "")),
    }

def extract_attrs(data):
    inner = data.get("data", {}).get("data", {})
    return [{"name": a.get("name",""), "column": a.get("columnName",""),
             "display": a.get("displayName",""), "type": get_type_name(a.get("type","")),
             "biztype": a.get("biztype",""), "required": a.get("isRequired",""),
             "nullable": a.get("nullable","")} for a in inner.get("attributes", [])]

def extract_assocs(data):
    inner = data.get("data", {}).get("data", {})
    result = []
    for a in inner.get("associationAttributes", []):
        asc = a.get("association", {}) or {}
        result.append({
            "name": a.get("name",""), "column": a.get("columnName",""),
            "typeUri": a.get("typeUri",""), "display": a.get("displayName",""),
            "roleA": asc.get("roleA",""), "roleB": asc.get("roleB",""),
            "multi": asc.get("roleAMulti",""),
            "isolation": a.get("isolationLevel",""),
            "isComposition": a.get("isCompositionAttribute",""),
            "deactivated": a.get("deactivated",""),
        })
    return result

def is_meaningful_uri(uri):
    skip = re.compile(r'(DefineCharacter|FreeDefine|Freedefine|CharacteristicsDefine|UserDefineCharacter|FreeCharacteristics|UserDefine)$|Ct$|Chd$|Chm$')
    return not skip.search(uri)

def collect_new_uris(assocs, existing_uris, current_uri):
    new_uris = set()
    for a in assocs:
        tu = a.get('typeUri','')
        if not tu or tu == current_uri or tu in existing_uris: continue
        if '.itf.' in tu.lower() or tu.startswith('itf.'): continue
        if not is_meaningful_uri(tu): continue
        new_uris.add(tu)
    return new_uris

def gen_md(uri, summary, data, attrs, assocs):
    app = summary.get('app','')
    tags = json.dumps(["BIP","元数据","数据字典"]+([app] if app else [])+[uri], ensure_ascii=False)
    md = f"---\ntags: {tags}\ncreated: {today}\nupdated: {today}\n"
    md += f"sources: [元数据API queryByUri]\nplatform_version: \"BIP V5\"\n"
    md += f"project: \"\"\nlast_verified: {today}\nstatus: verified\nsource_type: api_response\n---\n\n"
    md += f"# {summary['displayName']} (`{uri}`)\n\n"
    md += f"> {app} | 物理表：`{summary['tableName']}`\n\n"
    md += f"## 基本信息\n\n| 属性 | 值 |\n|------|-----|\n"
    md += f"| 显示名 | {summary['displayName']} |\n| 物理表 | `{summary['tableName']}` |\n"
    if summary.get('domain'): md += f"| 数据库 schema | `{summary['domain']}` |\n"
    md += f"| 所属应用 | `{app}` |\n"
    if summary.get('buildTime'): md += f"| 构建时间 | `{summary['buildTime']}` |\n"

    md += f"\n## 主键与编码\n\n| 角色 | 字段名 | 类型 | 说明 |\n|------|--------|------|------|\n"
    md += f"| 主键 | `{summary.get('pkField','id')}` | {summary.get('pkType','')} | {summary.get('pkDisplay','')} |\n"
    if summary.get('codeField'):
        md += f"| 编码 | `{summary['codeField']}` | {summary.get('codeType','')} | {summary.get('codeDisplay','')} |\n"

    md += f"\n---\n\n## 直接属性（{len(attrs)}个）\n\n"
    md += "| # | 字段名 | 显示名 | 数据库列 | 类型 |\n|---|--------|--------|---------|------|\n"
    for i,a in enumerate(attrs,1):
        md += f"| {i} | `{a['name']}` | {a['display']} | `{a['column']}` | {a['type']} |\n"

    if assocs:
        md += f"\n---\n\n## 关联属性（{len(assocs)}个）\n\n"
        md += "| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |\n|---|--------|--------|---------|--------|------|\n"
        for i,a in enumerate(assocs,1):
            md += f"| {i} | `{a['name']}` | {a['display']} | `{a['typeUri']}` | {a.get('isolation','')} | {a.get('isComposition','')} |\n"

    return md

def run_phase(target_files):
    existing_uris = get_existing_uris()
    all_new = set()
    cnt = 0
    for fname in target_files:
        fpath = os.path.join(JSON_DIR, fname)
        if not os.path.exists(fpath):
            print(f"[SKIP] {fname}")
            continue
        data = load_json(fpath)
        inner = data.get("data",{}).get("data",{})
        uri = inner.get("uri","")
        if not uri: continue
        s = extract_summary(data)
        attrs = extract_attrs(data)
        assocs = extract_assocs(data)
        print(f"  {uri} | {s['displayName']} | attrs={len(attrs)} | assocs={len(assocs)}")
        md = gen_md(uri, s, data, attrs, assocs)
        fn = f"{s['displayName']}-{uri.replace('.','_')}.md".replace("/","_").replace("\\","_")
        with open(os.path.join(ENTITIES_DIR, fn), 'w', encoding='utf-8') as f:
            f.write(md)
        nu = collect_new_uris(assocs, existing_uris, uri)
        all_new.update(nu)
        existing_uris.add(uri)
        cnt += 1
    return all_new, cnt

if __name__ == "__main__":
    import subprocess, sys

    # Phase 1: initial files
    phase1 = sorted([f for f in os.listdir(JSON_DIR) if f.startswith('metadata_') and f.endswith('.json') and not f.startswith('metadata__')])
    print(f"Phase 1: {len(phase1)} entities")
    new_uris, cnt = run_phase(phase1)
    print(f"Done: {cnt}, new URIs: {len(new_uris)}")

    round_num = 2
    while new_uris:
        print(f"\nPhase {round_num}: pulling {len(new_uris)} URIs...")
        for uri in sorted(new_uris):
            subprocess.run(["python", r"C:\Users\99558\.claude\skills\yonyou-bip-dev\scripts\bip_metadata_query.py", uri, "--json-only", "--output-dir", JSON_DIR], capture_output=True, timeout=120)

        new_files = []
        for uri in sorted(new_uris):
            fn = "metadata_" + uri.replace(".", "_").replace("-", "-") + ".json"
            if os.path.exists(os.path.join(JSON_DIR, fn)):
                new_files.append(fn)

        if not new_files:
            print("无新JSON，停止")
            break

        new_uris, cnt = run_phase(new_files)
        print(f"Done: {cnt}, new URIs: {len(new_uris)}")
        for u in sorted(new_uris): print(f"  - {u}")

        if len(new_uris) == 0:
            break
        round_num += 1

    print("\nAll done!")
    # Cleanup
    import shutil
    shutil.rmtree(JSON_DIR, ignore_errors=True)
    print("JSON已清理")
