# |<<

**自定义服务项目 (bd_uh_srvudcate_cont / nc.vo.nhbd.srv.SrvUDCateContVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_udcatecont | 项目主键 | pk_udcatecont | char(50) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | itemno | 序号 | itemno | int |  | 整数 (Integer) |
| 5 | itemid | 项目编码 | itemid | varchar(30) | √ | 字符串 (String) |
| 6 | itemname | 项目名称 | itemname | varchar(50) | √ | 字符串 (String) |
| 7 | itemdes | 项目描述 | itemdes | varchar(200) |  | 备注 (Memo) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |