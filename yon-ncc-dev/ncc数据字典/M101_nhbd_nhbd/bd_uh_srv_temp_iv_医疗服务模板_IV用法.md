# |<<

**医疗服务模板_IV用法 (bd_uh_srv_temp_iv / com.yonyou.yh.nhis.bd.srvtmpl.vo.SrvTmplIVVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtempiv | 服务模板IV主键 | pk_srvtempiv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_srvtemp | 模板 | pk_srvtemp | varchar(50) |  | 字符串 (String) |
| 5 | code | IV组编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | IV组名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | descr | 组描述 | descr | varchar(200) |  | 备注 (Memo) |
| 8 | pk_freq | 医嘱频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 9 | pk_usage | 用法主键 | pk_usage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 10 | pk_usagenote | 用法要求主键 | pk_usagenote | varchar(20) |  | 药品用法要求(自定义档案) (Defdoc-030408) |
| 11 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 12 | dt_usage | 用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 13 | dt_usagenote | 用法要求编码 | dt_usagenote | varchar(50) |  | 字符串 (String) |
| 14 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |