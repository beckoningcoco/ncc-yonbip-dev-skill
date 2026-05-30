# |<<

**居民信息_登录信息 (uh_pi_login / com.yonyou.yh.nhis.pi.pati.vo.PatiLoginVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6200.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patilog | 患者登陆主键 | pk_patilog | char(20) | √ | 主键 (UFID) |
| 2 | code_log | 登陆编码 | code_log | varchar(30) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | mpi | 区域主索引 | mpi | varchar(30) |  | 字符串 (String) |
| 6 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 7 | dt_sex | 患者性别编码 | dt_sex | varchar(50) |  | 字符串 (String) |
| 8 | pk_sex | 患者性别 | pk_sex | char(20) |  | 主键 (UFID) |
| 9 | birthdate | 出生日期 | birthdate | char(19) |  | 日期 (UFDate) |
| 10 | dt_idtype | 身份证件类型编码 | dt_idtype | varchar(50) |  | 字符串 (String) |
| 11 | pk_idtype | 身份证件类型 | pk_idtype | char(20) |  | 主键 (UFID) |
| 12 | idno | 身份证件号码 | idno | varchar(50) |  | 字符串 (String) |
| 13 | pwd_log | 登录口令 | pwd_log | varchar(50) |  | 字符串 (String) |
| 14 | date_regit | 登录注册日期 | date_regit | char(19) |  | 日期时间 (UFDateTime) |
| 15 | mobile | 手机号码 | mobile | varchar(50) |  | 字符串 (String) |
| 16 | email | 邮箱 | email | varchar(50) |  | 字符串 (String) |
| 17 | dt_country | 国家编码 | dt_country | varchar(50) |  | 字符串 (String) |
| 18 | pk_country | 国家 | pk_country | char(20) |  | 主键 (UFID) |
| 19 | dt_region_prov | 省(直辖市)编码 | dt_region_prov | varchar(50) |  | 字符串 (String) |
| 20 | dt_region_city | 市(地)编码 | dt_region_city | varchar(50) |  | 字符串 (String) |
| 21 | dt_region_dist | 区(县)编码 | dt_region_dist | varchar(50) |  | 字符串 (String) |
| 22 | addr | 地址 | addr | varchar(256) |  | 字符串 (String) |
| 23 | flag_active | 有效标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 25 | pk_region_prov | 省(直辖市) | pk_region_prov | char(20) |  | 主键 (UFID) |
| 26 | pk_region_city | 市(地) | pk_region_city | char(20) |  | 主键 (UFID) |
| 27 | pk_region_dist | 区(县) | pk_region_dist | char(20) |  | 主键 (UFID) |
| 28 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |