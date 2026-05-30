# |<<

**客户范围子实体 (sr_plcy_cust / nc.vo.sr.policy.entity.PlcyCustVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_cust | 客户范围子实体 | pk_plcy_cust | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ccustbaseclassid | 客户基本分类 | ccustbaseclassid | varchar(20) |  | 客户基本分类 (custclass) |
| 4 | ccustsaleclassid | 客户销售分类 | ccustsaleclassid | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 5 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 6 | bremoveflag | 排除 | bremoveflag | char(1) |  | 布尔类型 (UFBoolean) |