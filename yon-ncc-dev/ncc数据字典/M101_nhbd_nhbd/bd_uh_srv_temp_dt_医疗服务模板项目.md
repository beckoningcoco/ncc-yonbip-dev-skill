# |<<

**医疗服务模板项目 (bd_uh_srv_temp_dt / com.yonyou.yh.nhis.bd.pub2.tmpl.vo.SrvTmplDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1128.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtempdt | 模板服务项目主键 | pk_srvtempdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_srvtemp | 模板 | pk_srvtemp | varchar(50) |  | 字符串 (String) |
| 5 | sortno_parent | 上级医嘱序号 | sortno_parent | varchar(30) |  | 字符串 (String) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 8 | pk_freq | 频次 | pk_freq | varchar(20) |  | 医嘱频次 (OrdFreqVO) |
| 9 | pk_useage | 用法主键 | pk_useage | varchar(20) |  | 药品用法(自定义档案) (Defdoc-030401) |
| 10 | usegenote | 用法要求 | usegenote | varchar(50) |  | 字符串 (String) |
| 11 | pk_dept_exec | 执行科室 | pk_dept_exec | varchar(20) |  | 组织_部门 (dept) |
| 12 | quan | 单次用量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_measdoc | 用量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 14 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 15 | flag_ord_def | 自定义说明医嘱标志 | flag_ord_def | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | desc_ord_def | 自定义说明医嘱内容 | desc_ord_def | varchar(256) |  | 字符串 (String) |
| 17 | sortnum | 排序号 | sortnum | int |  | 整数 (Integer) |
| 18 | body_ris | 检查部位 | body_ris | varchar(200) |  | 字符串 (String) |
| 19 | def1 | 自定义1 | def1 | varchar(200) |  | 字符串 (String) |
| 20 | def2 | 自定义2 | def2 | varchar(200) |  | 字符串 (String) |
| 21 | def3 | 自定义3 | def3 | varchar(200) |  | 字符串 (String) |
| 22 | def4 | 自定义4 | def4 | varchar(200) |  | 字符串 (String) |
| 23 | def5 | 自定义5 | def5 | varchar(200) |  | 字符串 (String) |
| 24 | def6 | 自定义6 | def6 | varchar(200) |  | 字符串 (String) |
| 25 | def7 | 自定义7 | def7 | varchar(200) |  | 字符串 (String) |
| 26 | def8 | 自定义8 | def8 | varchar(200) |  | 字符串 (String) |
| 27 | def9 | 自定义9 | def9 | varchar(200) |  | 字符串 (String) |
| 28 | def10 | 自定义10 | def10 | varchar(200) |  | 字符串 (String) |
| 29 | def11 | 自定义11 | def11 | varchar(200) |  | 字符串 (String) |
| 30 | def12 | 自定义12 | def12 | varchar(200) |  | 字符串 (String) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |