# |<<

**融资需求 (fd_demand / nc.vo.fd.fdreg.DemandVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2182.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_demand | 主键 | pk_demand | char(20) | √ | 主键 (UFID) |
| 2 | demand_no | 需求编号 | demand_no | varchar(50) |  | 字符串 (String) |
| 3 | demand_name | 需求名称 | demand_name | varchar(200) |  | 字符串 (String) |
| 4 | flag | 被引用 | flag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |