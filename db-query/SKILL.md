---
name: db-query
description: >
  通用数据库查询工具。支持 Oracle、达梦(Dameng)、MySQL 等主流数据库。
  从 yonyou-bip-dev 技能中的 db_config.json 读取连接信息，自动识别数据库类型。
  用户只需指定项目名和环境即可执行 SQL 查询。
trigger: >
  当用户提出"查数据库"、"执行SQL"、"查询XX表"、"查一下XX数据"等
  数据库查询需求时使用此技能。
---

# 数据库查询技能

## ⚠️ 安全规则（AI 执行前必须遵守）

### 规则 1：配置信息不完整时必须询问用户

当 `db_config.json` 中缺少必要的连接信息时（如项目不存在、用户未配置、密码缺失），**必须主动向用户询问缺失的信息**，不得静默跳过或猜测。

询问模板：
```
项目 "XX" 的数据库配置不完整，缺少以下信息：
- 数据库地址 (host)
- 端口 (port)
- 用户名/密码
请提供缺失的信息。
```

### 规则 2：连接失败时必须确认配置

数据库连接失败时（超时、认证失败、网络不可达），**必须向用户确认数据库信息是否正确**，并提供当前使用的连接信息供用户核查。

询问模板：
```
连接 [项目名] 的 [环境] 环境失败：
  地址: 10.0.1.100:1521
  用户: appuser
  错误: ORA-01017 用户名/密码无效

请确认以上信息是否正确？如需修改请提供正确的连接信息。
```

### 规则 3：生产环境 / 写操作时严格确认

> 🔴 这是最重要的规则，违反可能造成数据丢失！

当 SQL 包含以下关键词时，**必须在执行前向用户二次确认**：
- `INSERT`、`UPDATE`、`DELETE`、`DROP`、`TRUNCATE`、`ALTER`、`CREATE`
- 或者 `--env prod`、`--env production`

确认模板：
```
⚠️ 危险操作确认

即将对以下目标执行 写操作：
  项目: 国投中鲁(BIP R6)
  环境: prod (生产环境)
  数据库: MySQL @ 10.61.128.217:3306
  SQL: DELETE FROM sdic_materials_balance WHERE i_org_id = '...'

该操作将修改/删除生产数据，不可撤销。确认执行吗？(yes/no)
```

- **用户必须明确回复"是"、"确认"、"yes"或"执行"后才可执行**
- SELECT 语句无需确认（即使是生产环境）
- **禁止**用 `--force` 参数跳过此检查

## 支持数据库

| 数据库 | Python 驱动 |
|--------|------------|
| Oracle | `oracledb`（自动 thin→thick 回退） |
| 达梦 (Dameng) | `dmPython` |
| MySQL | `pymysql` |
| PostgreSQL | `psycopg2` |

## 配置格式（新增项目）

```json
"项目名": {
  "type": "oracle",           ← 必须：oracle / dm / mysql / mssql
  "test": {
    "host": "192.168.1.1",
    "port": 1521,
    "service_name": "orcl",
    "users": { "用户名": "密码" }
  }
}
```

## 配置来源

已预配置项目：机械院(NCC2111)、天九(NCC2312)、泸州老窖(BIP旗舰版)、国投中鲁(BIP R6)

## 使用方式

```bash
python C:\Users\99558\.claude\skills\db-query\scripts\db_query.py \
  -p "国投中鲁" -e test -s "SELECT COUNT(*) FROM ..."

# 写操作会触发二次确认
python ... -p "机械院" -e prod -s "DELETE FROM ..."
```

## 依赖安装

```bash
pip install oracledb    # Oracle (已装)
pip install dmPython     # 达梦 (已装)
pip install pymysql      # MySQL (需装)
```
