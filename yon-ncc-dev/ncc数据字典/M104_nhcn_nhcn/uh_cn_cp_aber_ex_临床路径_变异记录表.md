# |<<

**临床路径_变异记录表 (uh_cn_cp_aber_ex / com.yonyou.yh.nhis.cn.cp.vo.CpAberExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5962.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aber_ex | 主键 | pk_aber_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_pv | 患者就诊主键 | pk_pv | varchar(20) |  | 主键 (UFID) |
| 5 | pk_cp_ex | 路径记录表id | pk_cp_ex | varchar(20) |  | 主键 (UFID) |
| 6 | pk_stage_ex | 阶段记录表id | pk_stage_ex | varchar(20) |  | 主键 (UFID) |
| 7 | item_info_ex | 项目明细记录表ID | item_info_ex | varchar(20) |  | 主键 (UFID) |
| 8 | pk_aber | 变异字典id | pk_aber | varchar(20) |  | 临床路径_变异原因字典 (cncpaber) |
| 9 | pk_psn_ex | 操作人id | pk_psn_ex | varchar(32) |  | 主键 (UFID) |
| 10 | psn_name_ex | 操作人姓名 | psn_name_ex | varchar(32) |  | 字符串 (String) |
| 11 | date_aber | 变异时间 | date_aber | char(19) |  | 日期 (UFDate) |
| 12 | pk_abertype | 变异类型 | pk_abertype | varchar(20) |  | 主键 (UFID) |