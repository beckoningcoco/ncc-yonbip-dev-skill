#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
技能配置健康检查工具
首次安装时给出配置指引，日常使用时验证连通性
"""

import json
import os
import shutil
import sys

if sys.platform == "win32":
    try:
        sys.stdout.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass

SKILLS_DIR = os.path.expanduser(r"~\.claude\skills")
PASS = "✅"
FAIL = "❌"
WARN = "⚠️"

# 需要从 template 创建的配置文件列表
REQUIRED_CONFIGS = [
    {
        "name": "全局路径配置",
        "actual": os.path.join(SKILLS_DIR, "path_config.json"),
        "template": os.path.join(SKILLS_DIR, "path_config.json.template"),
        "desc": "NCC/BIP Home 目录、知识库路径等",
    },
    {
        "name": "数据库连接配置",
        "actual": os.path.join(SKILLS_DIR, "yonyou-bip-dev", "db_config.json"),
        "template": os.path.join(SKILLS_DIR, "yonyou-bip-dev", "db_config.json.template"),
        "desc": "各项目数据库地址、用户名、密码",
    },
]


def _auto_create_config(cfg):
    """从模板复制配置文件，不存在时创建最小示例"""
    if os.path.exists(cfg["template"]):
        try:
            shutil.copy2(cfg["template"], cfg["actual"])
            return True
        except Exception:
            return False
    # 模板不存在，创建最小示例
    try:
        dir_path = os.path.dirname(cfg["actual"])
        if dir_path and not os.path.isdir(dir_path):
            os.makedirs(dir_path, exist_ok=True)
        if "db_config" in cfg["name"]:
            _create_minimal_db_config(cfg["actual"])
        elif "路径" in cfg["name"]:
            _create_minimal_path_config(cfg["actual"])
        return True
    except Exception:
        return False


def _create_minimal_db_config(path):
    example = {
        "projects": {
            "示例项目": {
                "type": "mysql",
                "test": {
                    "host": "127.0.0.1",
                    "port": 3306,
                    "service_name": "your_database",
                    "users": {"用户名": "密码"}
                }
            }
        }
    }
    with open(path, "w", encoding="utf-8") as f:
        json.dump(example, f, ensure_ascii=False, indent=2)


def _create_minimal_path_config(path):
    example = {
        "用户目录": {"_说明": "你的 Windows 用户目录", "路径": "C:\\Users\\你的用户名"},
        "NCC_Home_2111": {"_说明": "NCC 2111 版本的 home 目录", "路径": "E:\\NCProject\\NCC\\your-project\\home"},
        "NCC_Home_2312": {"_说明": "NCC 2312 版本的 home 目录", "路径": ""},
        "BIP_Home_V5": {"_说明": "BIP 旗舰版 V5 的 home 目录", "路径": ""},
        "知识库目录": {"_说明": "Obsidian 知识库存放位置", "路径": "D:\\yon-bip-obsidian\\yon-bip-obsidian"},
        "Chrome调试用户目录": {"_说明": "Chrome 远程调试用户目录", "路径": "C:\\Users\\你的用户名\\chrome-debug"},
    }
    with open(path, "w", encoding="utf-8") as f:
        json.dump(example, f, ensure_ascii=False, indent=2)


def main():
    print("=" * 60)
    print("  技能配置健康检查")
    print("=" * 60)

    # === 0. 检查必需配置文件是否已创建 ===
    missing = []
    for cfg in REQUIRED_CONFIGS:
        if not os.path.exists(cfg["actual"]):
            missing.append(cfg)

    errors = 0

    if missing:
        print()
        print("  [待配置] 以下配置文件尚未创建，正在自动生成...")
        print()
        for i, cfg in enumerate(missing, 1):
            created = _auto_create_config(cfg)
            if created:
                print(f"  {PASS} 第 {i} 步: {cfg['name']} — 已自动创建")
                print(f"    文件: {cfg['actual']}")
                print(f"    用途: {cfg['desc']}")
                print(f"    {WARN} 请打开该文件，将示例值替换为你的实际信息")
                print()
            else:
                print(f"  {FAIL} 第 {i} 步: {cfg['name']} — 自动创建失败")
                print(f"    原因: 模板文件也缺失，请检查 Git 仓库是否完整")
                print(f"    模板: {cfg['template']}")
                print()
        print(f"  填写完成后，重新运行验证：")
        print(f"    python {__file__}")
        print()

    if os.path.exists(REQUIRED_CONFIGS[0]["actual"]):
        errors += check_path_config()
    if os.path.exists(REQUIRED_CONFIGS[1]["actual"]):
        errors += check_db_config()
    errors += check_python_deps()
    errors += check_essential_dirs()

    print()
    print("=" * 60)
    if errors == 0:
        if missing:
            print(f"  {WARN} 上述配置完成后即可正常使用")
        else:
            print(f"  {PASS} 全部通过，技能可正常使用")
    else:
        print(f"  {FAIL} 发现 {errors} 个问题，请修复后再使用")
        if _connection_failed:
            print(f"  {WARN} 部分连接失败可能是 VPN 未连接，不影响配置正确性")
    print("=" * 60)


_connection_failed = False


def any_connection_failed():
    return _connection_failed


# ========== path_config.json ==========
def check_path_config():
    path = os.path.join(SKILLS_DIR, "path_config.json")
    print(f"\n{PASS} path_config.json 已创建")
    try:
        with open(path, "r", encoding="utf-8") as f:
            config = json.load(f)
    except Exception as e:
        print(f"   {FAIL} JSON 格式错误: {e}")
        return 1

    errs = 0
    for key, info in config.items():
        if key.startswith("_"):
            continue
        p = info.get("路径", "")
        label = info.get("_说明", key)
        if not p or p == "auto":
            continue  # 空值和 auto 不算错
        if os.path.exists(p):
            print(f"   {PASS} {label}: {p}")
        else:
            print(f"   {FAIL} {label}: 路径不存在 → {p}")
            errs += 1
    return errs


# ========== db_config.json ==========
def check_db_config():
    global _connection_failed
    path = os.path.join(SKILLS_DIR, "yonyou-bip-dev", "db_config.json")
    print(f"\n{PASS} db_config.json 已创建")
    VALID_TYPES = {"oracle", "dm", "mysql", "postgresql", "mssql"}

    try:
        with open(path, "r", encoding="utf-8") as f:
            config = json.load(f)
    except Exception as e:
        print(f"   {FAIL} JSON 格式错误: {e}")
        return 1

    projects = config.get("projects", {})
    if not projects:
        print(f"   {WARN} 未配置任何项目，编辑 {path} 添加数据库连接")
        return 0

    errs = 0
    for name, proj in projects.items():
        db_type = proj.get("type", "")
        if db_type not in VALID_TYPES:
            print(f"   {FAIL} [{name}] type='{db_type}' 无效 (支持: {', '.join(sorted(VALID_TYPES))})")
            errs += 1
            continue

        for env_key in ["test", "prod"]:
            env = proj.get(env_key)
            if not env:
                continue
            missing = []
            if not env.get("host"):
                missing.append("host")
            if not env.get("port"):
                missing.append("port")
            if not env.get("users") or len(env["users"]) == 0:
                missing.append("users")
            if missing:
                print(f"   {FAIL} [{name}] {env_key} 环境缺少: {', '.join(missing)}")
                errs += 1
            else:
                user_count = len(env["users"])
                users_str = ", ".join(env["users"].keys())
                print(f"   {PASS} [{name}] {db_type} @ {env['host']}:{env['port']} ({user_count}用户: {users_str})")
                fc = try_connection(db_type, name, env, proj.get("oracle_mode", "thin"))
                if fc:
                    _connection_failed = True
                    errs += fc

    return errs


def try_connection(db_type, name, env, oracle_mode="thin"):
    testers = {
        "mysql": _test_mysql,
        "postgresql": _test_pg,
        "oracle": _test_oracle,
        "dm": _test_dm,
    }
    tester = testers.get(db_type)
    if tester:
        return tester(name, env, oracle_mode)
    return 0


def _test_mysql(name, env, _):
    try:
        import pymysql
        user = list(env["users"].keys())[0]
        pwd = env["users"][user]
        conn = pymysql.connect(
            host=env["host"], port=env["port"], user=user, password=pwd,
            database=env.get("service_name", ""), connect_timeout=5,
        )
        conn.close()
        print(f"      {PASS} 连接成功")
        return 0
    except ImportError:
        print(f"      {WARN} pymysql 未安装 → pip install pymysql")
        return 0
    except Exception as e:
        print(f"      {FAIL} 连接失败 ({e})")
        return 1


def _test_pg(name, env, _):
    try:
        import psycopg2
        user = list(env["users"].keys())[0]
        pwd = env["users"][user]
        conn = psycopg2.connect(
            host=env["host"], port=env["port"], user=user, password=pwd,
            dbname=env.get("service_name", ""), connect_timeout=5,
        )
        conn.close()
        print(f"      {PASS} 连接成功")
        return 0
    except ImportError:
        print(f"      {WARN} psycopg2 未安装 → pip install psycopg2-binary")
        return 0
    except Exception as e:
        print(f"      {FAIL} 连接失败 ({e})")
        return 1


def _test_oracle(name, env, oracle_mode):
    try:
        import oracledb
        if oracle_mode == "thick":
            try:
                oracledb.init_oracle_client()
            except Exception:
                pass
        user = list(env["users"].keys())[0]
        pwd = env["users"][user]
        dsn = oracledb.makedsn(env["host"], env["port"], service_name=env["service_name"])
        conn = oracledb.connect(user=user, password=pwd, dsn=dsn)
        conn.close()
        print(f"      {PASS} 连接成功 (mode={oracle_mode})")
        return 0
    except ImportError:
        print(f"      {WARN} oracledb 未安装 → pip install oracledb")
        return 0
    except Exception as e:
        print(f"      {FAIL} 连接失败 ({e})")
        return 1


def _test_dm(name, env, _):
    try:
        import dmPython
        user = list(env["users"].keys())[0]
        pwd = env["users"][user]
        conn = dmPython.connect(user=user, password=pwd, server=env["host"], port=env["port"])
        conn.close()
        print(f"      {PASS} 连接成功")
        return 0
    except ImportError:
        print(f"      {WARN} dmPython 未安装")
        return 0
    except Exception as e:
        print(f"      {FAIL} 连接失败 ({e})")
        return 1


# ========== Python 依赖 ==========
def check_python_deps():
    print(f"\n{PASS} Python {sys.version.split()[0]}")
    deps = [
        ("oracledb", "Oracle"),
        ("pymysql", "MySQL"),
        ("psycopg2", "PostgreSQL"),
    ]
    # 达梦驱动是可选的
    try:
        __import__("dmPython")
        print(f"   {PASS} 达梦 (dmPython)")
    except ImportError:
        print(f"   {WARN} 达梦 未安装 (如不需要可忽略)")
    for mod, label in deps:
        try:
            __import__(mod)
            print(f"   {PASS} {label} ({mod})")
        except ImportError:
            print(f"   {WARN} {label} 未安装 → pip install {mod}")
    return 0


# ========== 关键目录 ==========
def check_essential_dirs():
    dirs = [
        (os.path.join(SKILLS_DIR, "yonyou-bip-dev"), "旗舰版技能"),
        (os.path.join(SKILLS_DIR, "yon-ncc-dev"), "NCC 技能"),
        (os.path.join(SKILLS_DIR, "db-query"), "数据库查询技能"),
    ]
    print()
    errs = 0
    for d, label in dirs:
        if os.path.isdir(d):
            print(f"{PASS} {label}: {d}")
        else:
            print(f"{FAIL} {label}: 目录不存在 → {d}")
            errs += 1
    return errs


if __name__ == "__main__":
    main()
