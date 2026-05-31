# |<<

**坏账计提方案主表 (arap_dstlcase / nc.vo.arap.badacc.DstlCaseParentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/175.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dstlcase | 主键 | pk_dstlcase | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | code | 方案编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 方案名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | interobj | 往来对象 | interobj | int |  | 对象类型 (objTypeenum) |  | 0=客户; |