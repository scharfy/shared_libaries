// Instantiate PSR-7 HTTP Client
$psrHttpClient = new \GuzzleHttp\Client([
    'base_uri' => 'https://niceshops.myjetbrains.com/youtrack',
]);

// Instantiate YouTrack API HTTP Client Adapter
$httpClient = new \Cog\YouTrack\Rest\HttpClient\GuzzleHttpClient($psrHttpClient);

// Instantiate YouTrack API Token Authorizer
$authorizer = new \Cog\YouTrack\Rest\Authorizer\TokenAuthorizer('YOUTRACK_API_TOKEN');

// Instantiate YouTrack API Client
$youtrack = new \Cog\YouTrack\Rest\Client\YouTrackClient($httpClient, $authorizer);