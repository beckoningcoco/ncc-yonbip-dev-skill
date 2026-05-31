# |<<

**手术计费服务 (uh_bl_cg_opt / com.yonyou.yh.nhis.bl.cg.vo.BlCgOptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cgopt | 主键 | pk_cgopt | char(20) | √ | 主键 (UFID) |
| 2 | paticode | 患者编码 | paticode | varchar(50) |  | 字符串 (String) |
| 3 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 4 | pvcode | 就诊编码 | pvcode | varchar(50) |  | 字符串 (String) |
| 5 | pvtype | 就诊类型 | pvtype | varchar(50) |  | 字符串 (String) |
| 6 | hpcode | 医保类型 | hpcode | varchar(50) |  | 字符串 (String) |
| 7 | ordcode | 医嘱编码 | ordcode | varchar(50) |  | 字符串 (String) |
| 8 | ivgroupid | iv类所属组号 | ivgroupid | varchar(50) |  | 字符串 (String) |
| 9 | srvtype | 服务类型 | srvtype | varchar(50) |  | 字符串 (String) |
| 10 | srvcode | 服务编码 | srvcode | varchar(50) |  | 字符串 (String) |
| 11 | srvname | 服务名称 | srvname | varchar(500) |  | 字符串 (String) |
| 12 | srvprice | 服务价格 | srvprice | varchar(50) |  | 字符串 (String) |
| 13 | totalnum | 使用数量 | totalnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | unitcode | 数量单位 | unitcode | varchar(50) |  | 字符串 (String) |
| 15 | freqmne | 频次助记码 | freqmne | varchar(50) |  | 字符串 (String) |
| 16 | dt_usage | 用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 17 | usagename | 用法说明 | usagename | varchar(50) |  | 字符串 (String) |
| 18 | flag_med | 出院带药 | flag_med | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | flag_pati | 患者自备 | flag_pati | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | flag_bl | 计费标识 | flag_bl | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | bl_time | 计费时间 | bl_time | char(19) |  | 日期时间 (UFDateTime) |
| 22 | flag_intra | 术中用药标识 | flag_intra | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | quan | 单次用量 | quan | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | dt_measdoc | 单次用量单位编码 | dt_measdoc | varchar(50) |  | 字符串 (String) |
| 25 | note | 备注 | note | varchar(500) |  | 字符串 (String) |
| 26 | date_begin | 开始时间 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 27 | date_end | 结束时间 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 28 | code_psn_enter | 录入人员编码 | code_psn_enter | varchar(50) |  | 字符串 (String) |
| 29 | name_psn_enter | 录入人员名称 | name_psn_enter | varchar(50) |  | 字符串 (String) |
| 30 | code_psn_phy | 开立人员编码 | code_psn_phy | varchar(50) |  | 字符串 (String) |
| 31 | name_psn_phy | 开立人员名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 32 | dept_exec_code | 执行科室编码 | dept_exec_code | varchar(50) |  | 字符串 (String) |
| 33 | dept_exec_name | 执行科室 | dept_exec_name | varchar(500) |  | 字符串 (String) |
| 34 | code_psn_chk | 核对人员编码 | code_psn_chk | varchar(50) |  | 字符串 (String) |
| 35 | name_psn_chk | 核对人员 | name_psn_chk | varchar(50) |  | 字符串 (String) |
| 36 | date_chk | 核对日期 | date_chk | char(19) |  | 日期时间 (UFDateTime) |
| 37 | code_psn_stop | 停止人员编码 | code_psn_stop | varchar(50) |  | 字符串 (String) |
| 38 | name_psn_stop | 停止人员 | name_psn_stop | varchar(50) |  | 字符串 (String) |
| 39 | date_stop | 停止日期 | date_stop | char(19) |  | 日期时间 (UFDateTime) |
| 40 | code_psn_cancel | 取消人员编码 | code_psn_cancel | varchar(50) |  | 字符串 (String) |
| 41 | name_psn_cancel | 取消人员 | name_psn_cancel | varchar(50) |  | 字符串 (String) |
| 42 | date_cancel | 取消日期 | date_cancel | char(19) |  | 日期时间 (UFDateTime) |
| 43 | eu_status | 医嘱状态 | eu_status | varchar(50) |  | 字符串 (String) |
| 44 | pk_ord | 医嘱主键 | pk_ord | varchar(50) |  | 字符串 (String) |
| 45 | code_apply | 申请单号 | code_apply | varchar(50) |  | 字符串 (String) |
| 46 | org_exec_code | 执行机构编码 | org_exec_code | varchar(50) |  | 字符串 (String) |
| 47 | org_exec_name | 执行机构名称 | org_exec_name | varchar(500) |  | 字符串 (String) |
| 48 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 49 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 50 | dept_phy_code | 开立科室部门 | dept_phy_code | varchar(50) |  | 字符串 (String) |
| 51 | dept_phy_name | 开立科室部门名称 | dept_phy_name | varchar(50) |  | 字符串 (String) |
| 52 | date_entry | 开立时间 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 53 | date_sign | 签署时间 | date_sign | char(19) |  | 日期时间 (UFDateTime) |
| 54 | code_exec_psn | 执行人编码 | code_exec_psn | varchar(50) |  | 字符串 (String) |
| 55 | name_exec_psn | 执行人 | name_exec_psn | varchar(50) |  | 字符串 (String) |
| 56 | date_exec | 执行时间 | date_exec | char(19) |  | 日期时间 (UFDateTime) |
| 57 | bar_code | 条形码 | bar_code | varchar(50) |  | 字符串 (String) |
| 58 | eu_ordtype | 医嘱类型 | eu_ordtype | int |  | 整数 (Integer) |