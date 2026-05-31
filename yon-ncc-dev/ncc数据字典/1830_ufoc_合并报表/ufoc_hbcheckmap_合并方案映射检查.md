# |<<

**合并方案映射检查 (ufoc_hbcheckmap / nc.vo.hbbb.hbscheme.HBSchemeCheckMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5878.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbcheckmap | 主键 | pk_hbcheckmap | char(20) | √ | 主键 (UFID) |
| 2 | ufoc_code | 对应编码 | ufoc_code | varchar(50) |  | 字符串 (String) |
| 3 | ufoc_name | 对应名称 | ufoc_name | varchar(50) |  | 字符串 (String) |
| 4 | ufoc_type | 类别 | ufoc_type | varchar(50) |  | 字符串 (String) |
| 5 | pk_project | 合并报表项目 | pk_project | varchar(20) |  | 合并报表项目 (project) |
| 6 | pk_report | 报表 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 7 | pk_measure | 报表指标 | pk_measure | varchar(50) |  | 字符串 (String) |