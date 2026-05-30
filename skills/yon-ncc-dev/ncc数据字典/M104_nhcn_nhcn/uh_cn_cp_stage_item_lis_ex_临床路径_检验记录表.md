# |<<

**临床路径_检验记录表 (uh_cn_cp_stage_item_lis_ex / com.yonyou.yh.nhis.cn.cp.vo.CpLisExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lis_ex | 主键 | pk_lis_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_item_ex | 项目记录表中的项目id | pk_item_ex | varchar(20) | √ | 主键 (UFID) |
| 5 | pk_lis | 路径制定表中的检验项目明细id | pk_lis | varchar(20) |  | 主键 (UFID) |
| 6 | pk_aber | 变异字典id | pk_aber | varchar(20) |  | 主键 (UFID) |
| 7 | pk_psn_ex | 执行人id | pk_psn_ex | varchar(32) |  | 主键 (UFID) |
| 8 | psn_name_ex | 执行人姓名 | psn_name_ex | varchar(50) |  | 字符串 (String) |
| 9 | date_ex | 执行时间 | date_ex | char(19) |  | 字符串 (String) |
| 10 | state | 默认为0：未提交，1：已提交 | state | varchar(50) |  | 字符串 (String) |