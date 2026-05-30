# |<<

**医疗执行_部门_标本采集 (uh_ex_dept_labcoll / com.yonyou.yh.nhis.ex.mt.vo.DeptMTAppLabItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_labcoll | 部门医技标本采集主键 | pk_labcoll | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_deptmt | 医疗执行 | pk_deptmt | varchar(20) |  | 医疗执行_部门_医技 (deptmtapply) |
| 5 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 6 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 7 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 9 | code_apply | 申请单号码 | code_apply | varchar(50) |  | 字符串 (String) |
| 10 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 11 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 12 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 13 | name_ord | 医嘱名称 | name_ord | varchar(50) |  | 字符串 (String) |
| 14 | desc_ord | 医嘱内容 | desc_ord | varchar(256) |  | 字符串 (String) |
| 15 | pk_ordsrv | 医嘱服务 | pk_ordsrv | varchar(50) |  | 字符串 (String) |
| 16 | pk_srv | 检验项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 17 | pk_samptype | 标本类型 | pk_samptype | varchar(20) |  | 标本类型(自定义档案) (Defdoc-030200) |
| 18 | dt_samptype | 标本类型编码 | dt_samptype | varchar(50) |  | 字符串 (String) |
| 19 | pk_colltype | 采集方法 | pk_colltype | varchar(20) |  | 采集方法(自定义档案) (Defdoc-030201) |
| 20 | dt_colltype | 采集方法编码 | dt_colltype | varchar(50) |  | 字符串 (String) |
| 21 | pk_contype | 试管类型 | pk_contype | varchar(20) |  | 试管类型(自定义档案) (Defdoc-030203) |
| 22 | dt_contype | 试管类型编码 | dt_contype | varchar(50) |  | 字符串 (String) |
| 23 | spcn | 采集标本数量 | spcn | int |  | 整数 (Integer) |
| 24 | date_coll | 标本采集日期时间 | date_coll | char(19) |  | 日期时间 (UFDateTime) |
| 25 | pk_psn_coll | 标本采集人员 | pk_psn_coll | varchar(20) |  | 人员基本信息 (psndoc) |
| 26 | name_psn_coll | 标本采集人员名称 | name_psn_coll | varchar(50) |  | 字符串 (String) |
| 27 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |