# |<<

**临床路径_阶段表 (uh_cn_cp_stage / com.yonyou.yh.nhis.cn.cp.vo.CpStageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stage | 阶段ID | pk_stage | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_cp | 临床路径ID | pk_cp | char(20) | √ | 主键 (UFID) |
| 5 | stage_sn | 阶段序号 | stage_sn | varchar(20) |  | 字符串 (String) |
| 6 | parent_stage | 父节点 | parent_stage | varchar(20) |  | 字符串 (String) |
| 7 | name_stage | 阶段名称 | name_stage | varchar(128) |  | 字符串 (String) |
| 8 | min_in_day_no | 本阶段开始于住院第几天 | min_in_day_no | int |  | 整数 (Integer) |
| 9 | max_in_day_no | 本阶段结束于住院第几天 | max_in_day_no | int |  | 整数 (Integer) |
| 10 | suger_min_day_no | 本阶段手术开始于第几天 | suger_min_day_no | int |  | 整数 (Integer) |
| 11 | suger_max_day_no | 本阶段手术结束于第几天 | suger_max_day_no | int |  | 整数 (Integer) |
| 12 | flag_day_oper | 是否手术日/出院日：1手术日2出院日 | flag_day_oper | int |  | 整数 (Integer) |