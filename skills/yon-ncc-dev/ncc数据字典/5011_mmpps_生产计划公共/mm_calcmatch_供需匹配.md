# |<<

**供需匹配 (mm_calcmatch / nc.vo.mmpps.plo.sd.entity.PWBSmatchItems)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3645.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsmatchid | 供给匹配表 | cppsmatchid | char(20) | √ | 主键 (UFID) |
| 2 | cppsmaterialid | 物料范围表 | cppsmaterialid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | ncansupplynum | 可供给数量 | ncansupplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nsupplynum | 匹配数量 | nsupplynum | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | computecode | 运算标识 | computecode | varchar(40) |  | 字符串 (String) |
| 9 | cppsdemandid | 需求来源明细 | cppsdemandid | varchar(20) |  | 需求来源明细 (mm_calcdemand) |
| 10 | cppssupplyid | 供应来源明细 | cppssupplyid | varchar(20) |  | 供给来源 (mm_calcsupply) |
| 11 | breservation | 预留 | breservation | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | dmatchtime | 匹配日期 | dmatchtime | char(19) |  | 日期 (UFDate) |
| 13 | matchrowno | 匹配行号 | matchrowno | int |  | 整数 (Integer) |
| 14 | bexmatch | 是否超期匹配 | bexmatch | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 16 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 17 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nbillnum | 单据主数量 | nbillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nbillexenum | 已执行主数量 | nbillexenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | fbillstatus | 单据状态值 | fbillstatus | varchar(50) |  | 字符串 (String) |
| 21 | fbillstatusname | 单据状态 | fbillstatusname | varchar(50) |  | 字符串 (String) |
| 22 | fmatchtype | 需求/供给类型 | fmatchtype | int |  | 匹配类型 (MatchType) |  | 1=需求; |