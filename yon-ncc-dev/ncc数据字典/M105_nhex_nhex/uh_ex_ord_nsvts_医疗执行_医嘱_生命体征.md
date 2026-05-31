# |<<

**医疗执行_医嘱_生命体征 (uh_ex_ord_nsvts / com.yonyou.yh.nhis.ex.mt.vo.ExOrdNsvtsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6095.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nsvts | 护理生理体征执行主键 | pk_nsvts | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_ordmt | 医疗执行 | pk_ordmt | varchar(20) |  | 医疗执行_医嘱_医技 (OrdMTApplyVO) |
| 5 | pk_srvtype | 服务类型 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 6 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_srv | 生命体征指标 | pk_srv | varchar(50) |  | 字符串 (String) |
| 8 | code_srv | 生命体征指标编码 | code_srv | varchar(50) |  | 字符串 (String) |
| 9 | name_srv | 生命体征指标名称 | name_srv | varchar(50) |  | 字符串 (String) |
| 10 | pk_vtscoll | 生命指标采集方式 | pk_vtscoll | varchar(20) |  | 指标采集方式(自定义档案) (Defdoc-030701) |
| 11 | dt_vtscoll | 生命指标采集方式编码 | dt_vtscoll | varchar(50) |  | 字符串 (String) |
| 12 | pk_measdoc_med | 医学单位 | pk_measdoc_med | varchar(20) |  | 计量单位 (measdoc) |
| 13 | date_vts | 指标日期 | date_vts | char(19) |  | 日期 (UFDate) |
| 14 | flag_result | 测量结果标志 | flag_result | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | quan_vts | 指标数值 | quan_vts | varchar(50) |  | 字符串 (String) |
| 16 | quan1_vts | 指标数值_附加 | quan1_vts | varchar(50) |  | 字符串 (String) |
| 17 | pk_vtsdesc | 指标描述主键 | pk_vtsdesc | varchar(20) |  | 生命体征指标类型(自定义档案) (Defdoc-030700) |
| 18 | dt_vtsdesc | 指标描述编码 | dt_vtsdesc | varchar(50) |  | 字符串 (String) |
| 19 | desc_vts | 指标描述 | desc_vts | varchar(50) |  | 字符串 (String) |
| 20 | dt_vtsdesc_ext | 指标描述编码_附加 | dt_vtsdesc_ext | varchar(50) |  | 字符串 (String) |
| 21 | desc1_vts | 指标描述_附加 | desc1_vts | varchar(50) |  | 字符串 (String) |
| 22 | pk_psn_vts | 测量人员 | pk_psn_vts | varchar(20) |  | 人员基本信息 (psndoc) |
| 23 | name_psn_exec | 测量人员名称 | name_psn_exec | varchar(50) |  | 字符串 (String) |
| 24 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 25 | pk_cnslot | 临床业务日期区间 | pk_cnslot | varchar(50) |  | 字符串 (String) |
| 26 | datetime_vts | 指标实际测量日期时间 | datetime_vts | varchar(50) |  | 字符串 (String) |
| 27 | eu_vtsmestype | 测量规范类型 | eu_vtsmestype | int |  | 测量属性 (VtsMesTypeEnum) |  | 0=正常测量; |