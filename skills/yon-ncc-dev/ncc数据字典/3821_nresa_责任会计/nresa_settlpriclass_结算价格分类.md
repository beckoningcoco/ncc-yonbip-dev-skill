# |<<

**结算价格分类 (nresa_settlpriclass / nc.vo.nresa.insetprice.settlpriclass.SettlPriClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3895.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlpriclass | 结算价格分类主键 | pk_settlpriclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | innersetclass | 内部结算分类 | innersetclass | int | √ | 内部结算分类 (InnerSetEnum) |  | 1=内部实物结算清单; |