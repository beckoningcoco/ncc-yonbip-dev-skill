# NCC / YonBIP Dev Skill Toolkit

用友 BIP 旗舰版 & NCC 开发技能合集，支持数据库查询、源码分析、NCC 插件开发、知识库管理等。

## 包含技能

| 技能 | 说明 |
|------|------|
| `yonyou-bip-dev` | BIP 旗舰版开发（客开、元数据、SQL 模板、项目配置） |
| `yon-ncc-dev` | NCC 定制开发（业务插件、后台任务、参照、源码反编译、数据字典） |
| `db-query` | 通用数据库查询工具（Oracle / 达梦 / MySQL / PostgreSQL） |
| `baoyu-url-to-markdown` | 网页抓取转 Markdown |
| `llm-wiki` | 个人知识库构建 |

## 快速安装

> 在 **CMD 或 PowerShell** 原生终端中运行，不要从 Git Bash 运行。

```bash
git clone git@github.com:beckoningcoco/ncc-yonbip-dev-skill.git
cd ncc-yonbip-dev-skill
setup.bat                 # 交互式安装
```

安装脚本自动完成：
1. 创建目录联结（junction）将技能安装到 `~/.claude/skills/`
2. 安装 `baoyu-url-to-markdown` 的 npm 依赖
3. 提示输入 NCHOME 路径，建立 NCC 源码索引

### 参数

```bash
setup.bat --quiet           # 跳过所有交互提示
setup.bat --skip-ncc        # 跳过 NCC 索引构建
setup.bat -q --skip-ncc     # 组合使用
```

---

## 安装后配置（必须）

安装完成后，技能还不能直接用——需要配置本地路径和数据库连接。以下 3 步按顺序做。

### 第 1 步：配置本地路径

编辑 `~/.claude/skills/path_config.json`（从 `path_config.json.template` 复制）：

```json
{
  "用户目录": { "路径": "C:\\Users\\你的用户名" },
  "NCC_Home_2111": { "路径": "E:\\NCProject\\NCC\\your-project\\home" },
  "NCC_Home_2312": { "路径": "E:\\NCProject\\NCC2312\\your-project\\home" },
  "BIP_Home_V5": { "路径": "E:\\download2" },
  "知识库目录": { "路径": "D:\\yon-bip-obsidian\\yon-bip-obsidian" },
  "Chrome调试用户目录": { "路径": "C:\\Users\\你的用户名\\chrome-debug" }
}
```

> 每个字段的中文注释说明了用途和如何获取。`NCC_Home_2312` 和 `BIP_Home_V5` 为可选，没有就不填。

### 第 2 步：配置数据库连接

编辑 `~/.claude/skills/yonyou-bip-dev/db_config.json`（从 `db_config.json.template` 复制）：

```json
{
  "projects": {
    "你的项目名": {
      "type": "mysql",
      "test": {
        "host": "10.0.1.100",
        "port": 3306,
        "service_name": "",
        "users": { "用户名": "密码" }
      }
    }
  }
}
```

支持的 `type`：`oracle` / `dm`（达梦） / `mysql` / `postgresql`

| `type` | 需安装的 Python 库 |
|--------|-------------------|
| `oracle` | `pip install oracledb` |
| `dm` | `pip install dmPython`（需达梦客户端） |
| `mysql` | `pip install pymysql` |
| `postgresql` | `pip install psycopg2-binary` |

> ⚠️ `db_config.json` 不会被 Git 提交（已加 `.gitignore`），每人在自己电脑上创建。

### 第 3 步：（可选）注册项目信息

在 `~/.claude/skills/yonyou-bip-dev/references/projects/` 下新建 `项目名.md`：

```markdown
# 项目名 (BIP 旗舰版)

## 环境: test
| 域名 | http://xxx.com/ |
| 安装器 | http://10.0.1.11:8080 | admin | password |

## 数据库
| 类型 | MySQL @ 10.0.1.100:3306 |

## VPN
| 地址 | https://vpn.xxx.com/ | 账号 | 密码 |
```

> ⚠️ 此目录不会被 Git 提交，每人在自己电脑上维护。

---

## 验证安装

安装完成后，运行健康检查确认一切正常：

```bash
python ~/.claude/skills/db-query/scripts/check_config.py
```

会逐一检查：配置文件完整性 → 数据库连通性 → Python 依赖 → 关键目录。

也可以手动测试数据库查询：

```bash
python ~/.claude/skills/db-query/scripts/db_query.py -p "天九" -s "SELECT 'Hello' AS greeting"

# 测试 NCC 源码反编译
java -jar ~/.claude/skills/yon-ncc-dev/cfr-0.152.jar --help

# 测试知识库查询
ls ~/.claude/skills/knowledge-base/yon-bip-obsidian/wiki/entities/
```

---

## 更新

```bash
cd ~/.claude/skills
git pull
# 如果使用 junction 安装，技能自动同步最新版本
```

## 新增项目

需要接触新项目时，只需要：

1. **加数据库**：在 `db_config.json` 的 `projects` 下加一条，填 `type` + host + 用户密码
2. **加项目信息**：在 `references/projects/` 下新建 `.md` 文件，记录 VPN、地址等
3. **知识库**：如有新元数据，用 `llm-wiki` 技能消化

不用改任何代码。

## 分享给同事

同事拉取仓库后，只需要做第 1 步和第 2 步（配路径 + 配数据库），其他文件已就绪。
