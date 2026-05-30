# |<<

**临床_处方 (uh_cn_pres / com.yonyou.yh.nhis.cn.ord.v2.vo.CNPresVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pres | 处方主键 | pk_pres | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 字符串 (String) |
| 4 | pk_pv | 就诊编码 | pk_pv | char(20) |  | 字符串 (String) |
| 5 | dt_prestype | 处方类型编码 | dt_prestype | char(20) |  | 字符串 (String) |
| 6 | dt_properties | 处方性质 | dt_properties | char(20) |  | 字符串 (String) |
| 7 | code_pres | 处方编码 | code_pres | varchar(30) |  | 字符串 (String) |
| 8 | date_pres | 处方日期 | date_pres | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_dept_phy | 开立科室 | pk_dept_phy | char(20) |  | 字符串 (String) |
| 10 | pk_psn_phy | 开立医生 | pk_psn_phy | char(20) |  | 字符串 (String) |
| 11 | name_psn_phy | 开立医生名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 12 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 13 | name_agent | 代办人姓名 | name_agent | varchar(50) |  | 字符串 (String) |
| 14 | idno_agent | 代办人身份证号 | idno_agent | varchar(30) |  | 字符串 (String) |
| 15 | addr_agent | 代办人联系地址 | addr_agent | varchar(256) |  | 字符串 (String) |
| 16 | teleno_agent | 代办人电话 | teleno_agent | varchar(30) |  | 字符串 (String) |
| 17 | flag_prt | 打印标志 | flag_prt | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | flag_det | 代煎标志 | flag_det | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 20 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 21 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 22 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 23 | flag_newborn | 婴儿标志 | flag_newborn | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | newborn | 婴儿序号 | newborn | int |  | 整数 (Integer) |
| 25 | pk_org_v | 所属机构版本 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 26 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 27 | pk_prestype | 处方类型 | pk_prestype | varchar(20) |  | 处方类型(自定义档案) (Defdoc-060101) |
| 28 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 29 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 30 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 31 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 32 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 33 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 34 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 35 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 36 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 37 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 38 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 39 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 40 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 41 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |