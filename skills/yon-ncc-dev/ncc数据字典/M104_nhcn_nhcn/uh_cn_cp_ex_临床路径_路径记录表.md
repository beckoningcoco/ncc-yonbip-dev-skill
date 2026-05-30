# |<<

**临床路径_路径记录表 (uh_cn_cp_ex / com.yonyou.yh.nhis.cn.cp.vo.CNCpExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5967.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cp_ex | 主键 | pk_cp_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_pv | 患者就诊主键 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 5 | pk_cp | 使用的路径id | pk_cp | char(20) |  | 主键 (UFID) |
| 6 | date_input | 进入路径时间 | date_input | char(19) |  | 日期 (UFDate) |
| 7 | date_output | 结束路径时间 | date_output | char(19) |  | 日期 (UFDate) |
| 8 | pk_psn | 进入路径的医生id | pk_psn | char(20) |  | 主键 (UFID) |
| 9 | psn_name | 进入路径的医生姓名 | psn_name | varchar(32) |  | 字符串 (String) |
| 10 | statu_cp | 路径状态：1执行中 2已完成3路径变更4中途退出 | statu_cp | varchar(50) |  | 字符串 (String) |
| 11 | pk_aber | 编译字典id | pk_aber | char(20) |  | 主键 (UFID) |
| 12 | code_diag | 诊断编码 | code_diag | varchar(32) |  | 字符串 (String) |
| 13 | name_diag | 诊断名称 | name_diag | varchar(64) |  | 字符串 (String) |
| 14 | pk_dept | 进入路径的科室 | pk_dept | varchar(50) |  | 字符串 (String) |
| 15 | pk_dept_ns | 进入路径的护理单元 | pk_dept_ns | varchar(50) |  | 字符串 (String) |