# |<<

**临床路径_阶段记录表 (uh_cn_cp_stage_ex / com.yonyou.yh.nhis.cn.cp.vo.CNCpStageExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5976.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stage_ex | 主键 | pk_stage_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_stage | 路径制定中的阶段id | pk_stage | char(20) |  | 主键 (UFID) |
| 5 | name_stage | 路径制定中的阶段名字 | name_stage | varchar(128) |  | 字符串 (String) |
| 6 | pk_cp_ex | 记录表中的路径id | pk_cp_ex | char(20) |  | 主键 (UFID) |
| 7 | date_begin | 制定表中的阶段开始时间 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 8 | date_end | 制定表中的阶段结束时间 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 9 | fact_date_begin | 实际的阶段开始时间 | fact_date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 10 | fact_date_end | 实际的阶段结束时间 | fact_date_end | char(19) |  | 日期时间 (UFDateTime) |
| 11 | pk_aber | 变异字典id | pk_aber | char(20) |  | 主键 (UFID) |
| 12 | stage_flag | 阶段状态 ：0未执行 1正在执行 2 已执行 | stage_flag | int |  | 整数 (Integer) |
| 13 | parent_stage | 父节点 | parent_stage | varchar(50) |  | 字符串 (String) |
| 14 | pk_stage_check | 已选择的分支 | pk_stage_check | varchar(50) |  | 字符串 (String) |