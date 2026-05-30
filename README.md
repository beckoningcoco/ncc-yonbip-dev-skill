# NCC YonBIP Dev Skill Toolkit

用友 BIP/NCC 开发技能合集，一键安装。

## 包含技能

| 技能 | 说明 |
|------|------|
| `yon-ncc-dev` | NCC 定制开发（业务插件、后台任务、参照、源码分析） |
| `yonyou-bip-dev` | 旗舰版 BIP 开发 |
| `baoyu-url-to-markdown` | 网页抓取转 Markdown |
| `llm-wiki` | 个人知识库构建 |

## 快速安装

> **重要：请在 CMD 或 PowerShell 原生终端中运行，不要从 Git Bash 运行。**

```bash
git clone git@github.com:beckoningcoco/ncc-yonbip-dev-skill.git
cd ncc-yonbip-dev-skill
setup.bat                 # 交互式安装（推荐）
```

安装脚本会：
1. 创建目录联结（junction）将技能安装到 Claude Code 的 skills 目录
2. 安装 baoyu-url-to-markdown 的 npm 依赖
3. 提示输入 NCHOME 路径，建立源码索引

### 参数

```bash
setup.bat --quiet         # 跳过所有交互提示，不建索引
setup.bat --skip-ncc      # 跳过 NCC 索引构建步骤
setup.bat -q --skip-ncc   # 组合使用
```

### 手动配置 NCC

```bash
python skills\yon-ncc-dev\scripts\build_index.py E:\path\to\ncc\home 2111
```

## 自定义路径

安装前，建议先编辑 **`path_config.json`**，将里面的路径改成你自己电脑上的实际路径：

- `NCC_Home_2111` / `NCC_Home_2312`：你的 NCC home 目录
- `Chrome调试用户目录`：baoyu-url-to-markdown 使用的 Chrome 调试目录
- 其他路径一般无需修改

> 文件中每个路径都有中文注释说明用途和如何获取。

## 使用前提

- **Windows CMD 或 PowerShell** 终端（不要用 Git Bash）
- Claude Code CLI 已安装
- Node.js（baoyu-url-to-markdown 需要）
- Python 3（源码索引构建需要）
- 至少一个 NCC home 目录

## 更新

```bash
git pull
# 如果使用 junction 安装，技能会自动同步最新版本
```
