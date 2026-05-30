# |<<

**对外投资子基金信息 (ipmfund_childfunds / nc.vo.ipmfund.kanban.ChildfundsBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_childfunds | 子基金主键 | pk_childfunds | varchar(50) | √ | 字符串 (String) |
| 2 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 3 | name | 基金名称 | name | varchar(200) |  | 字符串 (String) |
| 4 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 5 | vmanagetype | 管理类型 | vmanagetype | varchar(50) |  | 管理类型 (FundManageType) |  | 1=自我管理; |