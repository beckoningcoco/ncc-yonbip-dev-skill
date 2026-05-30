# |<<

**生产会议编码 (scapto_genemeetcode / nc.vo.scapto.genemeetcode.GeneMeetCodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_genemeetcode | 生成会议编码主键 | pk_genemeetcode | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 决策企业 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 决策企业版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | pk_decidemeettype | 会议类型 | pk_decidemeettype | varchar(50) |  | 字符串 (String) |
| 6 | vyear | 年度 | vyear | varchar(50) |  | 字符串 (String) |
| 7 | imonth | 月份 | imonth | int |  | 整数 (Integer) |
| 8 | iserailno | 流水号 | iserailno | int |  | 整数 (Integer) |