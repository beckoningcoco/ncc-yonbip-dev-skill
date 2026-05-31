# |<<

**临床路径_排除条件记录表 (uh_cn_cp_exc_ex / com.yonyou.yh.nhis.cn.cp.vo.CpExcExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5969.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exc_ex | 主键 | pk_exc_ex | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_cp_ex | 路径记录表中的id | pk_cp_ex | varchar(20) | √ | 主键 (UFID) |
| 5 | pk_exc | 排除条件表的id | pk_exc | varchar(20) | √ | 主键 (UFID) |