# |<<

**医嘱流向模式_类型关系 (bd_uh_wf_type / com.yonyou.yh.nhis.bd.ordwfmode.vo.WfTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1143.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wftype | 流向模式类型主键 | pk_wftype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | pk_srvtype | 服务类型 | pk_srvtype | varchar(50) |  | 字符串 (String) |
| 6 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_depttype | 部门类型 | pk_depttype | varchar(20) |  | 部门类型(自定义档案) (Defdoc-010200) |
| 8 | dt_depttype | 部门类型编码 | dt_depttype | varchar(50) |  | 字符串 (String) |
| 9 | flag_sys | 系统定义标志 | flag_sys | char(1) |  | 布尔类型 (UFBoolean) |