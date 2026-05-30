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

```bash
git clone https://github.com/beckoningcoco/ncc-yonbip-dev-skill.git
cd ncc-yonbip-dev-skill
setup.bat      # Windows
# 或
bash setup.sh  # Mac/Linux
```

安装脚本会：
1. 将技能链接到 Claude Code 的 skills 目录
2. 安装 baoyu-url-to-markdown 的 npm 依赖
3. 提示输入 NCHOME 路径，建立源码索引

## 使用前提

- Claude Code CLI 已安装
- Node.js（baoyu-url-to-markdown 需要）
- Python 3（源码索引构建需要）
- 至少一个 NCC home 目录

## 更新

```bash
git pull
# 如果 ncc_home_path.json 有新增版本字段，手动合并
```
