# |<<

**授信信息版本 (cdmc_authinfo_v / nc.vo.cdmc.cdm.contract.version.ConAuthInfoVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_conauthinfo_b | 子表PK | pk_conauthinfo_b | char(20) |  | 主键 (UFID) |
| 3 | bankprotocolid | 授信协议 | bankprotocolid | varchar(20) |  | 银行授信协议 (bankprotocol) |
| 4 | cccurrtypeid | 授信币种 | cccurrtypeid | varchar(20) |  | 币种 (currtype) |
| 5 | cctypeid | 授信类别 | cctypeid | varchar(20) |  | 授信类别 (tmpub_cctype) |
| 6 | creagrtype | 授信类型 | creagrtype | varchar(50) |  | 授信类型 (AuthTypeEnum) |  | GROUP=集团授信; |