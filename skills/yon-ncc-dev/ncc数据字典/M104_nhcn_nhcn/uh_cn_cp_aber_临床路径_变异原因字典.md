# |<<

**临床路径_变异原因字典 (uh_cn_cp_aber / com.yonyou.yh.nhis.cn.cp.vo.CpAberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aber | 主键 | pk_aber | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_abertype | 变异分类 | pk_abertype | varchar(20) |  | 临床路径_变异原因分类字典 (cncpabertype) |
| 5 | desc_aber | 变异描述 | desc_aber | varchar(255) |  | 字符串 (String) |
| 6 | enable_aber | 是否启用:0是, 1否 | enable_aber | int |  | 整数 (Integer) |