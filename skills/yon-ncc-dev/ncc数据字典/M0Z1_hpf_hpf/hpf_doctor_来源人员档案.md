# |<<

**来源人员档案 (hpf_doctor / nc.vo.hpf.doctor.DoctorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doctor | 主键 | pk_doctor | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 业务单元编码 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 3 | code | 医生编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 医生名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | source | 来源 | source | varchar(50) |  | 字符串 (String) |
| 6 | remark | 备注 | remark | varchar(500) |  | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 12 | pk_dept | 所属科室 | pk_dept | varchar(20) |  | 来源科室档案 (HpcfDeptVO) |
| 13 | noperppsn | 非绩效人员 | noperppsn | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 54 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 55 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 56 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 57 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |