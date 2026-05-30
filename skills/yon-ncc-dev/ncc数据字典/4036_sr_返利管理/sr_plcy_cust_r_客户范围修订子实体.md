# |<<

**客户范围修订子实体 (sr_plcy_cust_r / nc.vo.sr.policy.revise.entity.PlcyCustReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5464.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_cust_r | 客户范围修订子实体 | pk_plcy_cust_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_cust | 客户范围子实体 | pk_plcy_cust | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | ccustbaseclassid | 客户基本分类 | ccustbaseclassid | varchar(20) |  | 客户基本分类 (custclass) |
| 5 | ccustsaleclassid | 客户销售分类 | ccustsaleclassid | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 6 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | bremoveflag | 排除 | bremoveflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |