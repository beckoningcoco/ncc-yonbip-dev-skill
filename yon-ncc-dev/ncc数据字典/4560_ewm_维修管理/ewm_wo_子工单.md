# |<<

**子工单 (ewm_wo / nc.vo.ewm.workorder.WOChildrenVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo | 子工单主键 | pk_wo | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent_wo | 父工单主键 | pk_parent_wo | varchar(20) |  | 工单 (WorkOrder) |
| 3 | innercode | 内码 | innercode | varchar(200) |  | 字符串 (String) |
| 4 | status_follow | 继承父工单状态 | status_follow | char(1) |  | 布尔类型 (UFBoolean) |