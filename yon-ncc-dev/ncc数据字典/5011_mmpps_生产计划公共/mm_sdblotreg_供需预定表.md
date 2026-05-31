# |<<

**供需预定表 (mm_sdblotreg / nc.vo.mmpps.lotreg.entity.SdbLotRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3780.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lotreg | 主键 | pk_lotreg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(50) |  | 字符串 (String) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(50) |  | 字符串 (String) |
| 7 | pk_batchcode | 批次号主键 | pk_batchcode | varchar(20) |  | 字符串 (String) |
| 8 | batchcode | 批次号档案 | batchcode | varchar(40) |  | 字符串 (String) |
| 9 | cdemandkey | 需求关键字 | cdemandkey | varchar(50) |  | 字符串 (String) |
| 10 | csupplykey | 供给关键字 | csupplykey | varchar(50) |  | 字符串 (String) |
| 11 | nreservationnum | 预留主数量 | nreservationnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nlotregnum | 预定主数量 | nlotregnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | dmatchdate | 匹配日期 | dmatchdate | char(19) |  | 日期 (UFDate) |
| 14 | icalcsort | 运算匹配顺序 | icalcsort | int |  | 整数 (Integer) |
| 15 | ilogretsort | 供需预定顺序 | ilogretsort | int |  | 整数 (Integer) |
| 16 | dcalcts | 运算匹配日期 | dcalcts | char(19) |  | 日期时间 (UFDateTime) |
| 17 | tlotregtime | 预定时间 | tlotregtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | vupdatelog | 更新日志 | vupdatelog | varchar(50) |  | 字符串 (String) |
| 19 | vbacklog | 备份日志 | vbacklog | varchar(50) |  | 字符串 (String) |