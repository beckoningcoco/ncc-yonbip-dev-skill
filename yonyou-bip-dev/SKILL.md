---
name: yonyou-bip-dev
description: >
  用友 BIP 旗舰版客开技能。当用户提到用友、YonBIP、BIP、旗舰版、客开、或者咨询用友 BIP 平台开发相关问题时，使用此技能。
  即使用户没有明确说"用友"，只要描述了用友 BIP 特有的开发模式（如 SuperDO 继承、单据扩展、
  YMS 异步执行、平台回调等），也应该使用此技能，或者其他和JAVA后端开发相关的内容也可以参考该文档，也包括数据库问题，linux服务器问题等
---

# 用友 BIP 客开技能

## 版本定位

本技能服务于 **用友旗舰版（BIP / YonBIP）**。

> **版本区分**：用友有两个主要产品线——
> - **旗舰版（BIP）** ← 本技能
> - **NCC（NC Cloud）** → 对应技能 `yon-ncc-dev`（与本技能同级目录）
>
> 收到问题时务必先判断版本，再使用对应技能及其参考资料。不确定时主动询问用户。

### 问题记录路由

当用户要求将问题/解决方案记录到参考资料时：
- **旗舰版问题** → 记录到本技能 `references/` 目录
- **NCC 问题** → 记录到 `yon-ncc-dev` 对应子技能的 `references/` 目录

## 必看条目，每次请认真阅读并理解以下文档中的内容。

参考文档

`skill约束.md`
`数据库查询约束.md`
`project-config.md`（入口索引，具体项目在 `references/projects/` 下）
`db_config.json`（本地配置，从 `db_config.json.template` 复制后填写）

> **本地配置文件**：`path_config.json`、`db_config.json` 已 `.gitignore`，每人从 `.template` 复制后自定义，不会产生 git 冲突。

### 模板配置缺失检查

> **强制规则**：以下文件由用户从 `.template` 复制后填写，仓库只提供模板。**AI 必须在每次对话开始时检查这些文件是否存在，如果缺失则主动提醒用户创建，不要静默跳过。**

| 模板文件 | 目标文件 | 说明 |
|----------|----------|------|
| `db_config.json.template` | `db_config.json` | 各项目数据库连接信息 |
| `bip_home_path.json.template` | `bip_home_path.json` | 本机 BIP home 路径和版本 |
| `../path_config.json.template` | `../path_config.json` | 集中路径配置（用户目录、NCC/BIP Home、知识库、Chrome 调试等），仓库根目录 |
| `../yon-ncc-dev/ncc_home_path.json.template` | `../yon-ncc-dev/ncc_home_path.json` | 本机 NCC home 路径和版本 |

检查时机：收到用户第一条消息后，在查找资料之前执行。如果目标文件不存在：
1. 告知用户缺少哪个配置文件
2. 说明用途
3. 询问是否现在创建（从 template 复制后让用户填写）

在回答用户提出的问题时，需要标注问题的类型

- 问题处理类 
  - 对于问题处理类问题，如果检索参考文档后发现已存在相关或者相近的文档资料，请标注是哪个项目上，版本是多少，什么环境发生了类似的问题。
  - 在回答问题前，请先梳理排查思路
  - 最后回答用户的问题
- 便捷帮助类
- 其他



如果用户提出的问题，经过判断是 问题处理类，但是并没有在skill中找到相关的资料，那么需要询问用户是否将当前问题记录到本地作为参考资料

当用户同意或允许时，请参考

`问题记录规范.md`将问题记录到本地 references目录下！



如果用户主动提出，想记录一个问题，或者登记一个问题等等，也请参照 `问题记录规范.md`

## 参考资料查找方式（自动扫描，无需手写索引）

> **重要**：查找参考资料时，**直接扫描对应目录**，根据文件名匹配用户问题，不要依赖手写索引文件。
> 文件名均为中文、描述性强，AI 可直接匹配。

| 问题类型 | 扫描目录 | 说明 |
|----------|----------|------|
| 便捷帮助类（SQL/API/脚本/模板等） | `references/旗舰版/` | `ls` 列出文件名 → 按关键词匹配 → 读取匹配的文档 |
| SQL 模板 | `references/SQL/` | 每条 SQL 独立一个文件，扫描匹配 |
| 问题处理类（报错/异常/故障） | `references/问题处理/` | `ls` 列出文件名 → 按报错关键词匹配 → 读取匹配的文档 |
| 项目配置（环境/账号/数据库等） | `references/projects/` | 每个项目独立一个文件 |
| 通用开发规范/事件码/单据类型 | `references/common/` | 按需检索 |


## 接收到用户的提问，处理流程

1. 当用户提出问题后，首先判断是否是 和 用友旗舰版/用友BIP/用友框架/NCC等用友产品相关的问题。如果是和代码，数据库，服务器操作等后端程序员开发相关的问题，则一律视为 旗舰版开发问题，如果是，则做下列判断 判断问题的类型 
   - 是否是用户提出报错，需要我来根据现有知识，回答客户的报错如何解决。
     - 是此类问题 → **扫描 `references/问题处理/` 目录**，根据报错关键词匹配已有文档。
   - 是否是 需要便捷协助，例如 生成SQL语句，生成阿尔萨斯命令，生成模板代码等便捷协助类问题。
     - 是此类问题 → **扫描 `references/旗舰版/` 目录**，根据场景关键词匹配已有文档。



2. 如果是非 用友旗舰版/用友BIP/用友框架/NCC等用友产品相关的问题 ，无需参考skill中的文档资料，自行作答即可。

## 源码索引配置

旗舰版 home 目录的源码索引由以下文件管理：

| 文件 | 作用 |
|------|------|
| `bip_home_path.json` | 本机 BIP home 路径 + 默认版本 |
| `class_index_<version>.json` | 每个版本独立的类名→jar 索引 |

**`bip_home_path.json` 结构**：

```json
{
  "default_version": "V5",
  "versions": {
    "V5": {
      "path": "E:/download2",
      "description": "BIP 旗舰版 V5",
      "index_file": "class_index_BIP_V5.json",
      "indexed": true
    }
  }
}
```

> **关于 `bip_home_path.json` 的生成**：该文件记录的是本机 BIP home 路径，每台机器不同，因此被 `.gitignore` 排除，不会入库。仓库中提供了 `bip_home_path.json.template`（空模板）作为格式参考。**首次运行 `build_index.py` 时会自动创建该文件**，后续再跑其他版本会追加到已有配置中，无需手动编辑。

## 工具脚本

| 脚本 | 路径 | 用途 |
|------|------|------|
| Chrome 调试端口 | `scripts/open_chrome_debug.bat` | 杀旧进程后以 `--remote-debugging-port=9222` 启动 Chrome |
| Oracle 查询工具 | `C:\Users\<你的用户名>\Desktop\db_query.py` | 通用 Oracle 数据库查询，支持多项目多环境 |
| 元数据查询 | `scripts/bip_metadata_query.py` | 通过 BIP OpenAPI 查询任意实体完整元数据，支持批量拉取所有子表 |
| 实体排重 | `scripts/check_entity_dedup.py` | 扫描 wiki 判断实体是否已消化，避免重复拉取 |

## 元数据/字典查询规则

> **触发条件**：当用户提到"元数据"、"字典"、"字段名"、"数据库列"、"查XX的元数据"、"XX有哪些字段"、"XX子表"等涉及 BIP 实体结构的问题时，按以下流程处理：

### 查询流程

```
用户提问"查XX的元数据"
    ↓
1. 先查知识库（D:\yon-bip-obsidian\yon-bip-obsidian\wiki\entities\）
   从每个 .md 的标题行 `# 实体名 (`uri`)` 提取 URI，精确匹配
   是否有对应实体页？
    ↓ 有 → 直接引用知识库页面回答（标注 [已验证]）
    ↓ 无 ↓
2. 调用元数据查询脚本
    python C:\Users\99558\.claude\skills\yonyou-bip-dev\scripts\bip_metadata_query.py <entityUri>
    ↓
3. 解析返回的 JSON，提取字段→列名映射，回答用户
    ↓
4. 询问用户：是否需要将此实体消化到知识库？
```

> **排重规则**：判断一个实体是否已消化，**以知识库 wiki/entities/ 为准，不依赖桌面 JSON 文件**。
> 每个实体页的标题行格式为 `# 显示名 (`voucher.order.OrderDetail`)`，提取括号内的 URI 即可做精确排重。

### 脚本用法

```bash
# 单个实体查询
python scripts/bip_metadata_query.py voucher.order.Order

# 批量拉取（查某个实体的所有子表）
python scripts/bip_metadata_query.py --all

# 仅保存 JSON，不打印摘要
python scripts/bip_metadata_query.py <uri> --json-only
```

### 已知实体 URI 速查（销售订单体系）

| 实体 | URI | 知识库页面 |
|------|-----|-----------|
| 销售订单主表 | `voucher.order.Order` | [[销售订单元数据]] |
| 订单明细 | `voucher.order.OrderDetail` | [[销售订单-OrderDetail]] |
| 订单明细组 | `voucher.order.OrderDetailGroup` | [[销售订单-OrderDetailGroup]] |
| 订单状态 | `voucher.order.OrderStatus` | [[销售订单-OrderStatus]] |
| 订单支付状态 | `voucher.order.OrderPaymentStatus` | [[销售订单-OrderPaymentStatus]] |
| 支付核验 | `voucher.order.PaymentVerification` | [[销售订单-PaymentVerification]] |
| 收款计划 | `voucher.order.PaymentSchedules` | [[销售订单-PaymentSchedules]] |
| 收款执行明细 | `voucher.order.PaymentExeDetail` | [[销售订单-PaymentExeDetail]] |
| 订单多价格 | `voucher.order.OrderPrice` | [[销售订单-OrderPrice]] |
| 返利汇总 | `voucher.order.RebateSum` | [[销售订单-RebateSum]] |
| 返利明细 | `voucher.order.RebateDetail` | [[销售订单-RebateDetail]] |
| 返利记录 | `voucher.order.RebateRecord` | [[销售订单-RebateRecord]] |
| 产品返利记录 | `voucher.order.ProductRebateRecord` | [[销售订单-ProductRebateRecord]] |
| 签署主体 | `voucher.order.SignSubject` | [[销售订单-SignSubject]] |
| 附件 | `voucher.order.OrderAttachment` | [[销售订单-OrderAttachment]] |
| 当前审批人 | `voucher.order.IBpmCurrentAuditorOrder` | [[销售订单-IBpmCurrentAuditorOrder]] |
| 业务阶段 | `voucher.order.OrderIBpmStep` | [[销售订单-OrderIBpmStep]] |
| 线索参与人 | `voucher.order.ClueParticipant` | [[销售订单-ClueParticipant]] |
| 头自定义项 | `voucher.order.OrderDefine` | [[销售订单-OrderDefine]] ⚠️ |
| 头自由定义 | `voucher.order.OrderFreeDefine` | [[销售订单-OrderFreeDefine]] ⚠️ |

### 脚本配置

脚本内置了以下配置（来自 `project-config.md` 国投中鲁/泸州老窖项目）：
- **API 网关**: `https://c3.yonyoucloud.com/iuap-api-gateway/`
- **元数据接口**: `/nfkwaryp/current_yonbip_default_sys/GDBG/queryByUri`
- **租户**: `nfkwaryp`
- **AppKey/Secret**: 已内置在脚本中

> 如果切换项目/环境，需修改脚本中的 `APP_KEY`、`APP_SECRET`、`TENANT_ID`、`BASE_DOMAIN` 四个变量。

