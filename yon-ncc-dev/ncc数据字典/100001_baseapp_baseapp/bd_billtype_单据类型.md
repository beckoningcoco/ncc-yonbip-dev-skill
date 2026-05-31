# |<<

**单据类型 (bd_billtype / nc.vo.pub.billtype.BilltypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/364.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypeid | 主键 | pk_billtypeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 编码 | pk_billtypecode | varchar(50) | √ | 字符串 (String) |
| 3 | billtypename | 名称 | billtypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | accountclass | 会计平台类 | accountclass | varchar(50) |  | 字符串 (String) |
| 5 | billstyle | 单据大类 | billstyle | int |  | 整数 (Integer) |
| 6 | checkclassname | 审批流检查类 | checkclassname | varchar(50) |  | 字符串 (String) |
| 7 | classname | 审批节点 | classname | varchar(50) |  | 字符串 (String) |
| 8 | isaccount | 是否会计平台 | isaccount | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isroot | 是否为根 | isroot | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | nodecode | 节点编码 | nodecode | varchar(50) |  | 字符串 (String) |
| 11 | referclassname | 查询类 | referclassname | varchar(50) |  | 字符串 (String) |
| 12 | systemcode | 所属系统类型 | systemcode | varchar(50) |  | 字符串 (String) |
| 13 | wherestring | 主表查询的内定Where语句 | wherestring | varchar(50) |  | 字符串 (String) |
| 14 | parentbilltype | 父单据类型 | parentbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 15 | component | 关联的元数据组件 | component | varchar(50) |  | 字符串 (String) |
| 16 | canextendtransaction | 可扩展交易类型 | canextendtransaction | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | istransaction | 是否为交易类型 | istransaction | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | forwardbilltype | 下游单据类型 | forwardbilltype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 19 | datafinderclz | 来源数据查询类 | datafinderclz | varchar(50) |  | 字符串 (String) |
| 20 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 21 | isbizflowbill | 是否业务流单据 | isbizflowbill | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | webnodecode | web节点编码 | webnodecode | varchar(20) |  | 字符串 (String) |
| 23 | islock | 是否封存 | islock | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | emendenumclass | 修订枚举类名 | emendenumclass | varchar(50) |  | 字符串 (String) |
| 25 | iseditableproperty | 是否可编辑属性 | iseditableproperty | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | isenablebutton | 是否可用按钮 | isenablebutton | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | isenabletranstypebcr | 是否支持交易类型编码规则 | isenabletranstypebcr | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 29 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 30 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |