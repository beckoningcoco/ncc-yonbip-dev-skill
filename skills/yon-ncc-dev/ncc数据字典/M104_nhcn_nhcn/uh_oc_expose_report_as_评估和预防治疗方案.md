# |<<

**评估和预防治疗方案 (uh_oc_expose_report_as / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportAsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6132.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_as | 评估和预防治疗方案主键 | pk_oc_expose_report_as | char(50) | √ | 主键 (UFID) |
| 2 | expose_grade | 暴露级别 | expose_grade | varchar(50) |  | 字符串 (String) |
| 3 | expose_source | 暴露源类型 | expose_source | varchar(50) |  | 字符串 (String) |
| 4 | flag_prm | 是否预防用药 | flag_prm | varchar(50) |  | 字符串 (String) |
| 5 | flag_side | 是否毒副作用 | flag_side | varchar(50) |  | 字符串 (String) |
| 6 | side_effect_note | 备注 | side_effect_note | varchar(50) |  | 字符串 (String) |
| 7 | alt | 肝功能检查 | alt | varchar(50) |  | 字符串 (String) |
| 8 | rft | 肾功能检查 | rft | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |