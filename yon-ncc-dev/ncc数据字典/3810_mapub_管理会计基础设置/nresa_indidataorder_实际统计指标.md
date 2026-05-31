# |<<

**实际统计指标 (nresa_indidataorder / nc.vo.mapub.indi.indidata.IndiDataOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3855.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indidataorder | 指标管理主键 | pk_indidataorder | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_staindi | 统计指标 | pk_staindi | varchar(20) |  | 统计指标 (staindi) |
| 5 | unit | 计量单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 6 | passdate | 过账日期 | passdate | char(19) |  | 日期 (UFDate) |
| 7 | passyear | 会计年度 | passyear | varchar(50) |  | 字符串 (String) |
| 8 | passperiod | 会计月份 | passperiod | varchar(50) |  | 字符串 (String) |
| 9 | layout | 页面布局 | layout | varchar(200) |  | 字符串 (String) |
| 10 | indiclass | 指标分类 | indiclass | varchar(50) |  | 指标数据分类 (indiclassEnum) |  | 1=公共_实际统计指标管理; |