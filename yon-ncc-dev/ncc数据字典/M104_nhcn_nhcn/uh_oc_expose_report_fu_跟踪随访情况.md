# |<<

**跟踪随访情况 (uh_oc_expose_report_fu / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportFuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6137.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_fu | 主键 | pk_oc_expose_report_fu | char(20) | √ | 主键 (UFID) |
| 2 | flag_acin | 暴露后四周内是否出现急性感染症状 | flag_acin | varchar(50) |  | 字符串 (String) |
| 3 | continue_days | 持续天数 | continue_days | varchar(50) |  | 字符串 (String) |
| 4 | acute_infec_sym | 具体症状 | acute_infec_sym | varchar(50) |  | 字符串 (String) |
| 5 | acute_infec_note | 备注 | acute_infec_note | varchar(50) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |