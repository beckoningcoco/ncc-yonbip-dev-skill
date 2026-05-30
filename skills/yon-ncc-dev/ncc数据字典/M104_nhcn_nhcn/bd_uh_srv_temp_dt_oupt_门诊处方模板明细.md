# |<<

**门诊处方模板明细 (bd_uh_srv_temp_dt_oupt / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcTempDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1129.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtempdt_oupt | 模板服务项目主键 | pk_srvtempdt_oupt | char(20) | √ | 主键 (UFID) |
| 2 | pk_srvtempdt_oupt | 模板服务项目主键 | pk_srvtempdt_oupt | char(20) | √ | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_srvtemp_oupt | 模板 | pk_srvtemp_oupt | varchar(20) | √ | 门诊处方模板 (CNOcTemp) |
| 6 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |
| 7 | sortno_parent | 上级医嘱序号 | sortno_parent | varchar(50) |  | 字符串 (String) |
| 8 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 9 | pk_freq | 医嘱频次 | pk_freq | varchar(50) |  | 字符串 (String) |
| 10 | pk_usage | 用法 | pk_usage | varchar(50) |  | 字符串 (String) |
| 11 | pk_tisane | 煎法 | pk_tisane | varchar(50) |  | 字符串 (String) |
| 12 | usagenote | 用法要求 | usagenote | varchar(50) |  | 字符串 (String) |
| 13 | quan_med | 单次用量 | quan_med | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pk_measdoc_med | 单次用量单位 | pk_measdoc_med | varchar(50) |  | 字符串 (String) |
| 15 | quan | 总量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_measdoc | 总量单位 | pk_measdoc | varchar(50) |  | 字符串 (String) |
| 17 | days_ord | 医嘱天数 | days_ord | int |  | 整数 (Integer) |
| 18 | pk_org_exec | 执行机构 | pk_org_exec | varchar(20) |  | 字符串 (String) |
| 19 | pk_dept_exec | 执行科室 | pk_dept_exec | varchar(50) |  | 字符串 (String) |
| 20 | pk_dept | 科室 | pk_dept | varchar(50) |  | 字符串 (String) |
| 21 | flag_ord_def | 自定义说明医嘱标志 | flag_ord_def | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | desc_ord_def | 自定义说明医嘱内容 | desc_ord_def | varchar(50) |  | 字符串 (String) |
| 23 | sortnum | 顺序号 | sortnum | int |  | 整数 (Integer) |
| 24 | body_ris | 检查部位 | body_ris | varchar(200) |  | 字符串 (String) |
| 25 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 26 | def1 | 冗余字段1 | def1 | varchar(50) |  | 字符串 (String) |
| 27 | def2 | 冗余字段2 | def2 | varchar(50) |  | 字符串 (String) |
| 28 | def3 | 冗余字段3 | def3 | varchar(50) |  | 字符串 (String) |
| 29 | def4 | 冗余字段4 | def4 | varchar(50) |  | 字符串 (String) |
| 30 | def5 | 冗余字段5 | def5 | varchar(50) |  | 字符串 (String) |
| 31 | def6 | 冗余字段6 | def6 | varchar(50) |  | 字符串 (String) |
| 32 | def7 | 冗余字段7 | def7 | varchar(50) |  | 字符串 (String) |
| 33 | def8 | 冗余字段8 | def8 | varchar(50) |  | 字符串 (String) |
| 34 | def9 | 冗余字段9 | def9 | varchar(50) |  | 字符串 (String) |
| 35 | def10 | 冗余字段10 | def10 | varchar(50) |  | 字符串 (String) |
| 36 | def11 | 冗余字段11 | def11 | varchar(50) |  | 字符串 (String) |
| 37 | def12 | 冗余字段12 | def12 | varchar(50) |  | 字符串 (String) |
| 38 | def13 | 冗余字段13 | def13 | varchar(50) |  | 字符串 (String) |
| 39 | def14 | 冗余字段14 | def14 | varchar(50) |  | 字符串 (String) |
| 40 | def15 | 冗余字段15 | def15 | varchar(50) |  | 字符串 (String) |
| 41 | def16 | 冗余字段16 | def16 | varchar(50) |  | 字符串 (String) |
| 42 | def17 | 冗余字段17 | def17 | varchar(50) |  | 字符串 (String) |
| 43 | def18 | 冗余字段18 | def18 | varchar(50) |  | 字符串 (String) |
| 44 | def19 | 冗余字段19 | def19 | varchar(50) |  | 字符串 (String) |
| 45 | def20 | 冗余字段20 | def20 | varchar(50) |  | 字符串 (String) |
| 46 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 47 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 48 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 49 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |