# |<<

**合并计税组 (wa_taxgroup / nc.vo.wa.taxgroup.WaTaxGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxgroup | 合并计税组主键 | pk_taxgroup | char(20) | √ | 主键 (UFID) |
| 2 | cgroupname | 组名称 | cgroupname | varchar(50) | √ | 字符串 (String) |
| 3 | ccomment | 备注 | ccomment | varchar(100) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 6 | syscreateflag | 系统创建标识 | syscreateflag | varchar(50) |  | 字符串 (String) |
| 7 | pk_country | 国家区域 | pk_country | varchar(20) |  | 国家地区 (globalcountry) |