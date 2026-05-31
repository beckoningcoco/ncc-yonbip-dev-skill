# |<<

**调整报表 (ufoc_adjreport / nc.vo.ufoc.adjreport.AdjReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5858.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjreport | 主键 | pk_adjreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表标识 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 3 | pk_hbscheme | 合并方案标识 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 4 | pk_adjscheme | 调整方案标识 | pk_adjscheme | varchar(20) |  | 报表调整方案 (adjscheme) |
| 5 | pk_keygroup | 关键字 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 6 | aloneid | aloneid | aloneid | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_user | 用户 | pk_user | varchar(20) |  | 用户 (user) |