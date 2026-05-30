# |<<

**交易类型 (bd_billtype / nc.vo.pub.billtype.BilltypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/362.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypeid | 主键 | pk_billtypeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 编码 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | billtypename | 名称 | billtypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | billstyle | 系统类别(单据大类) | billstyle | int |  | 整数 (Integer) |
| 5 | classname | 审批节点号 | classname | varchar(50) |  | 字符串 (String) |
| 6 | wherestring | 主表固定条件语句 | wherestring | varchar(256) |  | 字符串 (String) |
| 7 | referclassname | 参照对应的DMO类 | referclassname | varchar(50) |  | 字符串 (String) |
| 8 | checkclassname | 审批流检查类 | checkclassname | varchar(50) |  | 字符串 (String) |
| 9 | accountclass | 实现会计平台接口的类 | accountclass | varchar(50) |  | 字符串 (String) |
| 10 | systemcode | 系统类型代码 | systemcode | varchar(20) |  | 字符串 (String) |
| 11 | isaccount | 是否会计平台 | isaccount | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | isroot | 是否根节点 | isroot | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | nodecode | 制单节点号 | nodecode | varchar(20) |  | 字符串 (String) |
| 14 | parentbilltype | 父单据类型 | parentbilltype | varchar(20) |  | 字符串 (String) |
| 15 | component | 元数据组件 | component | varchar(128) |  | 字符串 (String) |
| 16 | canextendtransaction | 是否可扩展交易类型 | canextendtransaction | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | istransaction | 是否交易类型 | istransaction | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | forwardbilltype | 下游单据类型列表 | forwardbilltype | varchar(128) |  | 字符串 (String) |
| 19 | datafinderclz | 来源数据查询类 | datafinderclz | varchar(50) |  | 字符串 (String) |
| 20 | webnodecode | web节点号 | webnodecode | varchar(20) |  | 字符串 (String) |
| 21 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 22 | pk_group | 所属集团 | pk_group | char(20) |  | 字符串 (String) |
| 23 | isbizflowbill | 是否业务流单据 | isbizflowbill | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | islock | 是否封存 | islock | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | transtype_class | 交易类型扩展属性类名 | transtype_class | varchar(100) |  | 字符串 (String) |
| 26 | isapprovebill | 是否审批流单据 | isapprovebill | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | iseditableproperty | 可编辑单据属性 | iseditableproperty | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | isenablebutton | 可用按钮 | isenablebutton | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | emendenumclass | 修订枚举类 | emendenumclass | varchar(50) |  | 字符串 (String) |
| 30 | ncbrcode | 编码对象Code | ncbrcode | varchar(20) |  | 字符串 (String) |
| 31 | billcoderule | 编码规则PK | billcoderule | varchar(20) |  | 字符串 (String) |
| 32 | isworkflowcanautoapprove | 工作流有无本人自动审批选择 | isworkflowcanautoapprove | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | def2 | 扩展项2 | def2 | varchar(50) |  | 字符串 (String) |
| 34 | def3 | 扩展项3 | def3 | varchar(50) |  | 字符串 (String) |
| 35 | def1 | 扩展项1 | def1 | varchar(50) |  | 字符串 (String) |