# |<<

**对外投资项目信息 (ipmfund_investproject / nc.vo.ipmfund.kanban.InvestProjectBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investproject | 投资项目信息主键 | pk_investproject | varchar(50) | √ | 字符串 (String) |
| 2 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 3 | vbillname | 项目名称 | vbillname | varchar(400) |  | 字符串 (String) |
| 4 | pk_investtype | 投资类型 | pk_investtype | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 5 | investdir | 投资方向 | investdir | int |  | 投资方向 (InvestDirection) |  | 1=主业; |