# |<<

**临床_处方_门诊 (uh_cn_oupt_pres / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcPresVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6044.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pres | 处方主键 | pk_pres | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_pv | 就诊编码 | pk_pv | char(20) |  | 主键 (UFID) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 字符串 (String) |
| 6 | dt_prestype | 处方类型code | dt_prestype | varchar(20) |  | 主键 (UFID) |
| 7 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 字符串 (String) |
| 8 | dt_properties | 处方性质 | dt_properties | varchar(20) |  | 主键 (UFID) |
| 9 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 10 | code_pres | 处方编码 | code_pres | varchar(30) |  | 字符串 (String) |
| 11 | pk_prestype | 处方类型 | pk_prestype | varchar(20) |  | 字符串 (String) |
| 12 | date_pres | 处方日期 | date_pres | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_dept_phy | 开立科室 | pk_dept_phy | char(20) |  | 主键 (UFID) |
| 14 | pk_psn_phy | 开立医生 | pk_psn_phy | char(20) |  | 主键 (UFID) |
| 15 | name_psn_phy | 开立医生名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 16 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 17 | flag_newborn | 婴儿标志 | flag_newborn | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | flag_prt | 打印标志 | flag_prt | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | newborn | 婴儿序号 | newborn | int |  | 整数 (Integer) |
| 20 | pk_org_v | 所属机构版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 21 | flag_det | 代煎标志 | flag_det | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | type_pres | 处方分类 | type_pres | char(1) |  | 字符串 (String) | 0 |
| 23 | diagcode | 慢病病种编码 | diagcode | varchar(50) |  | 字符串 (String) |
| 24 | diagname | 慢病病种名称 | diagname | varchar(50) |  | 字符串 (String) |
| 25 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 26 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 28 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |