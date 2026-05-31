# |<<

**项目指标映射 (ufoc_measpromap / nc.vo.ufoc.unionproject.MeasProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measproject | 主键 | pk_measproject | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 3 | pk_measure | 报表指标名称 | pk_measure | varchar(50) |  | 字符串 (String) |
| 4 | measurepos | 指标位置 | measurepos | varchar(50) |  | 字符串 (String) |
| 5 | keyname | 关键字组合 | keyname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_project | 合并报表项目 | pk_project | varchar(20) |  | 合并报表项目 (project) |
| 7 | position | 显示位置 | position | varchar(50) |  | 字符串 (String) |