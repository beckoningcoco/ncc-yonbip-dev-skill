# |<<

**临床路径_变异原因分类字典 (uh_cn_cp_aber_type / com.yonyou.yh.nhis.cn.cp.vo.CpAberTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_abertype | 主键 | pk_abertype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | code_type | 分类编码 | code_type | varchar(20) |  | 字符串 (String) |
| 5 | name_type | 分类描述 | name_type | varchar(255) |  | 字符串 (String) |
| 6 | right_aber | 变异类型 | right_aber | int |  | 整数 (Integer) | 0 |