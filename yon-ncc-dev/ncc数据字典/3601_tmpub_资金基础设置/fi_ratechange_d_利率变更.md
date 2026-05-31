# |<<

**利率变更 (fi_ratechange_d / nc.vo.fi.rateconfig.RateAlterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2203.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratechange_d | 主键 | pk_ratechange_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_ratecode | 利率编码主键 | pk_ratecode | char(20) |  | 主键 (UFID) |
| 3 | revisedate | 起效日期 | revisedate | char(19) |  | 日期 (UFDate) |
| 4 | reviser | 修订人 | reviser | varchar(20) |  | 用户 (user) |
| 5 | versionno | 版本 | versionno | int |  | 整数 (Integer) |
| 6 | interestflag | 计息标识 | interestflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | periodflag | 启用期间利率 | periodflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | rationflag | 启用定额利率 | rationflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | overdueflag | 启用逾期利率 | overdueflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | headflag | 启用提前利率 | headflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |