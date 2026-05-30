# |<<

**工单结构 (ewm_wo / nc.vo.ewm.workorder.WOChildVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1957.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo | 子工单 | pk_wo | char(0) | √ | 工单 (WorkOrder) |
| 2 | pk_parent_wo | 父工单 | pk_parent_wo | varchar(20) |  | 工单 (WorkOrder) |
| 3 | innercode | 内码 | innercode | varchar(200) |  | 字符串 (String) |