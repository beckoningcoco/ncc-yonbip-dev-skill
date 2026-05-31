# |<<

**取价错误日志 (mapub_acquirepricelog / nc.vo.mapub.acquirepricelog.entity.AcquirePriceLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3589.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_log | 取价错误日志 | pk_log | char(20) | √ | 主键 (UFID) |
| 2 | vacquiretype | 取价类型 | vacquiretype | varchar(50) | √ | 字符串 (String) |
| 3 | pk_group | 取价集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 取价工厂 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 6 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 7 | begindate | 开始期间 | begindate | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | enddate | 截止期间 | enddate | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | isourcetype | 来源类型 | isourcetype | int |  | 价格来源 (priceSourceEnun) |  | 1=手工录入; |