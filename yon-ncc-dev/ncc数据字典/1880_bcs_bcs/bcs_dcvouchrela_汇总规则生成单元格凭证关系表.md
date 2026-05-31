# |<<

**汇总规则生成单元格凭证关系表 (bcs_dcvouchrela / nc.vo.bcs.vouch.DataCellVouchRelaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | task_alone_id | 合并任务aloneId | task_alone_id | varchar(64) |  | 字符串 (String) |
| 3 | target_unikey | 目标单元格 | target_unikey | varchar(99) |  | 字符串 (String) |
| 4 | orig_unikey | 来源单元格 | orig_unikey | varchar(99) |  | 字符串 (String) |
| 5 | pk_vouchhead | 凭证头 | pk_vouchhead | varchar(20) |  | 字符串 (String) |
| 6 | pk_vouchbody | 凭证体 | pk_vouchbody | varchar(20) |  | 字符串 (String) |
| 7 | pk_selforg | 主体 | pk_selforg | varchar(20) |  | 字符串 (String) |
| 8 | pk_rule | 规则 | pk_rule | varchar(20) |  | 字符串 (String) |
| 9 | pk_formula | 公式 | pk_formula | varchar(20) |  | 字符串 (String) |
| 10 | dim_note | 主要维度描述 | dim_note | varchar(100) |  | 字符串 (String) |
| 11 | used_stauts | 使用状态 | used_stauts | char(1) |  | 字符串 (String) |
| 12 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 13 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 14 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 15 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 16 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 17 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 18 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 19 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 20 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 21 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |