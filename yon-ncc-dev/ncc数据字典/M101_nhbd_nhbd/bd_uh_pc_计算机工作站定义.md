# |<<

**计算机工作站定义 (bd_uh_pc / nc.vo.nhbd.res.uhpc.UhPcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1064.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pc | 计算机主键 | pk_pc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 计算机工作站编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 计算机工作站名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | eu_addrtype | 对应的物理地址类型 | eu_addrtype | int |  | 对应的物理地址类型 (AddrTypeEnum) |  | 0=计算机名称; |